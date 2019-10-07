package org.crazyi.boot.c3;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = MyProp.class)
public class MyConfig {

}
