package io.github.futurewl.pre.processor;

import io.github.futurewl.pre.handler.PreHandlerB;
import org.thymeleaf.engine.ITemplateHandler;
import org.thymeleaf.preprocessor.IPreProcessor;
import org.thymeleaf.templatemode.TemplateMode;

public class PreProcessorB implements IPreProcessor {

    public TemplateMode getTemplateMode() {
        return TemplateMode.HTML;
    }

    public int getPrecedence() {
        return 0;
    }

    public Class<? extends ITemplateHandler> getHandlerClass() {
        return PreHandlerB.class;
    }
}
