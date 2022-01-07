package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

public class HtmlTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        Context ctx = new Context();
        String result = templateEngine.process("<input type='' th:value='angus'/>",
                ctx);
        System.out.println(result);
    }
}
