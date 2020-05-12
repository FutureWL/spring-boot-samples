package io.github.futurewl.post.process;

import io.github.futurewl.post.handler.PostHandler;
import org.thymeleaf.engine.ITemplateHandler;
import org.thymeleaf.postprocessor.IPostProcessor;
import org.thymeleaf.templatemode.TemplateMode;

public class MyPostProcessor implements IPostProcessor {

    public TemplateMode getTemplateMode() {
        return TemplateMode.HTML;
    }

    public int getPrecedence() {
        return 0;
    }

    public Class<? extends ITemplateHandler> getHandlerClass() {
        return PostHandler.class;
    }
}
