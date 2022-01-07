package io.github.futurewl.resolver;

import org.springframework.web.servlet.View;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 视图对象
 *
 * @author 杨恩雄
 */
public class MyView implements View {

    // 模板引擎对象
    private TemplateEngine templateEngine;

    // 模板名称
    private String template;

    private String contentType = "text/html;charset=UTF-8";

    public void setTemplateEngine(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public String getContentType() {
        return this.contentType;
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request,
                       HttpServletResponse response) throws Exception {
        // 将参数设置到Context
        Context ctx = new Context();
        for (String key : model.keySet()) {
            Object obj = model.get(key);
            ctx.setVariable(key, obj);
        }
        response.setContentType(this.contentType);
        // 直接使用 TemplateEngine 来处理模板
        templateEngine.process(template, ctx, response.getWriter());
    }
}
