package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;

public class WebApplication {

    private TemplateEngine templateEngine;

    private static WebApplication webApp;

    /*
     * 私有构造器
     */
    private WebApplication(ServletContext servletContext) {
        // 创建模板解析器
        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver(
                servletContext);
        // 设置模板模式为HTML
        templateResolver.setTemplateMode(TemplateMode.HTML);
        // 设置前缀与后缀
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setCharacterEncoding("UTF-8");
        this.templateEngine = new TemplateEngine();
        this.templateEngine.setTemplateResolver(templateResolver);
    }

    public static WebApplication getInstance(ServletContext servletContext) {
        if (webApp == null) {
            webApp = new WebApplication(servletContext);
        }
        return webApp;
    }

    public TemplateEngine getEngine() {
        return this.templateEngine;
    }
}
