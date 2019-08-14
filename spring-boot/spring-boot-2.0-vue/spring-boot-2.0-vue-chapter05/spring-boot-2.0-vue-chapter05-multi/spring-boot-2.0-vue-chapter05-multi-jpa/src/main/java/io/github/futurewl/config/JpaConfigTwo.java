package io.github.futurewl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Objects;

/**
 * Created by sang on 2018/7/16.
 */

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "io.github.futurewl.dao2",
        entityManagerFactoryRef = "entityManagerFactoryBeanTwo",
        transactionManagerRef = "platformTransactionManagerTwo")
public class JpaConfigTwo {

    @Resource(name = "dsTwo")
    DataSource dsTwo;

    @Autowired
    JpaProperties jpaProperties;

    @Bean
    LocalContainerEntityManagerFactoryBean entityManagerFactoryBeanTwo(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(dsTwo)
                .properties(jpaProperties.getProperties())
                .packages("io.github.futurewl.model")
                .persistenceUnit("pu2")
                .build();
    }

    @Bean
    PlatformTransactionManager platformTransactionManagerTwo(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(
                Objects.requireNonNull(
                        entityManagerFactoryBeanTwo(builder)
                                .getObject()));
    }
}
