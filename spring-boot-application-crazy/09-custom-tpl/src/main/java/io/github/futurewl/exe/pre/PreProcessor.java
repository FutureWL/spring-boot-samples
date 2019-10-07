package io.github.futurewl.exe.pre;

import org.thymeleaf.engine.ITemplateHandler;
import org.thymeleaf.preprocessor.IPreProcessor;
import org.thymeleaf.templatemode.TemplateMode;

public class PreProcessor implements IPreProcessor {

    public TemplateMode getTemplateMode() {
        return TemplateMode.HTML;
    }

    public int getPrecedence() {
        return 0;
    }

    public Class<? extends ITemplateHandler> getHandlerClass() {
        return PreHandler.class;
    }
}
