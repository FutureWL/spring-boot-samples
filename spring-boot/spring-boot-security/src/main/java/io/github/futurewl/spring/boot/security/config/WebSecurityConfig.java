package io.github.futurewl.spring.boot.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * 功能描述：Security 配置
 *
 * @author weilai create by 2019-05-30:14:47
 * @version 1.0
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService customerUserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

//        案例1

//        http
//                .formLogin()// 通过 formLogin 方法定制登录操作
//                .loginPage("/login")
//                .defaultSuccessUrl("/index")
//                .failureUrl("/login?error")
//                .permitAll()
//                .and()
//                .rememberMe() // 开启 cookie 存储用户信息
//                .tokenValiditySeconds(1209600) // 制定 cookie 有效期为 1209600 秒，即两个星期
//                .key("myKey")
//                .and()
//                .logout()
//                .logoutUrl("/custom-logout")
//                .logoutSuccessUrl("/logout-success")
//                .permitAll();

//        案例2
        http
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login?error")
                .permitAll()
                .and()
                .logout()
                .permitAll();


    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        // 内存中的用户 START

//        auth.inMemoryAuthentication()
//                .withUser("weilai").password("weilai").roles("ROLE_ADMIN")
//                .and()
//                .withUser("root").password("123").roles("ROLE_USER");

        // 内存中的用户 END

        auth.userDetailsService(customerUserService);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }
}
