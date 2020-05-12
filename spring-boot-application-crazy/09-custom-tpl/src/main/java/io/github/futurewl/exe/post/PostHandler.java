package io.github.futurewl.exe.post;

import org.thymeleaf.engine.AbstractTemplateHandler;
import org.thymeleaf.model.IText;

import java.util.Map;

public class PostHandler extends AbstractTemplateHandler {

    @Override
    public void handleText(IText text) {
        System.out.println("===== Post =====");
        Map<String, Object> attrs = getContext().getConfiguration().getExecutionAttributes();
        for (String key : attrs.keySet()) {
            System.out.println(key + "---" + attrs.get(key));
        }
        // 让责任链中的下一任处理者去执行
        super.handleText(text);
    }
}
