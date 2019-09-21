package io.github.futurewl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("root").password("123").roles("ADMIN", "DBA")
                .and()
                .withUser("admin").password("123").roles("ADMIN", "USER")
                .and()
                .withUser("weilai").password("123").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/user/**").access("hasAnyRole('ADMIN','USER')")
                .antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login_page")
                .loginProcessingUrl("/login")
                .usernameParameter("name")
                .passwordParameter("passwd")
                .successHandler((httpServletRequest, httpServletResponse, authentication) -> {
                    Object principal = authentication.getPrincipal();
                    httpServletResponse.setContentType("application/json;charset=utf-8");
                    PrintWriter out = httpServletResponse.getWriter();
                    httpServletResponse.setStatus(200);
                    Map<String, Object> map = new HashMap<>(2);
                    map.put("status", 200);
                    map.put("msg", principal);
                    ObjectMapper objectMapper = new ObjectMapper();
                    out.write(objectMapper.writeValueAsString(map));
                    out.flush();
                    out.close();
                })
                .failureHandler((httpServletRequest, httpServletResponse, e) -> {
                    httpServletResponse.setContentType("application/json;charset=utf-8");
                    PrintWriter out = httpServletResponse.getWriter();
                    httpServletResponse.setStatus(401);
                    Map<String, Object> map = new HashMap<>();
                    map.put("status", 401);
                    if (e instanceof LockedException) {
                        map.put("msg", "账户被锁定，登录失败");
                    } else if (e instanceof BadCredentialsException) {
                        map.put("msg", "账户名或密码输入错误，登录失败！");
                    } else if (e instanceof DisabledException) {
                        map.put("msg", "账户被禁用，登录失败！");
                    } else if (e instanceof AccountExpiredException) {
                        map.put("msg", "账户已过期，登录失败！");
                    } else if (e instanceof CredentialsExpiredException) {
                        map.put("msg", "密码与过期，登录失败！");
                    } else {
                        map.put("msg", "登录失败！");
                    }
                    ObjectMapper objectMapper = new ObjectMapper();
                    out.write(objectMapper.writeValueAsString(map));
                    out.flush();
                    out.close();
                })
                .and()
                .logout()
                .logoutUrl("/logout")
                .clearAuthentication(true)
                .invalidateHttpSession(true)
                .addLogoutHandler((httpServletRequest, httpServletResponse, authentication) -> {

                })
                .logoutSuccessHandler((httpServletRequest, httpServletResponse, authentication) -> {
                    httpServletResponse.sendRedirect("/login_page");
                })
                .permitAll()
                .and()
                .csrf().disable();
    }
}
