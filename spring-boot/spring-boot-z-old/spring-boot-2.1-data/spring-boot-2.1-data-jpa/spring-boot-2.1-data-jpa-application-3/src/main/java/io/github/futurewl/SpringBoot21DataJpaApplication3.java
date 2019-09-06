package io.github.futurewl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author weilai
 */
@RestController
@EnableJpaAuditing
@SpringBootApplication
public class SpringBoot21DataJpaApplication3 {

    @Autowired
    private UserCustomerRepository userCustomerRepository;

    @Bean
    public AuditorAware<Integer> auditorProvider() {
        return new MyAuditorAware();
    }

    @GetMapping("/save")
    public void save(@RequestParam Integer userId) {
//        System.out.println(userId);
        userCustomerRepository.save(new UserCustomerEntity("1", "Jack"));
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21DataJpaApplication3.class, args);
    }
}
