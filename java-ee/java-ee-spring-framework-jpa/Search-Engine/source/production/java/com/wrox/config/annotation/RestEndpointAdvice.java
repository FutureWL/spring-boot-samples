package com.wrox.config.annotation;

import org.springframework.web.bind.annotation.ControllerAdvice;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ControllerAdvice
public @interface RestEndpointAdvice {
    String value() default "";
}
