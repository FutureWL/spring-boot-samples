package com.wrox.config.annotation;

import org.springframework.stereotype.Controller;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
public @interface RestEndpoint {
    String value() default "";
}
