package com.wrox.config.annotation;

import org.springframework.stereotype.Controller;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
public @interface WebController {
    String value() default "";
}
