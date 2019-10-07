package io.github.futurewl.mv;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
public class MyWebConfig extends WebMvcConfigurationSupport {

    @Override
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        final RequestMappingHandlerMapping requestMappingHandlerMapping = super
                .requestMappingHandlerMapping();
        requestMappingHandlerMapping.setRemoveSemicolonContent(false);
        return requestMappingHandlerMapping;
    }
}
