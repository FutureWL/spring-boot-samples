package io.github.futurewl.pre.handler;

import org.thymeleaf.engine.AbstractTemplateHandler;
import org.thymeleaf.model.IText;

public class PreHandlerB extends AbstractTemplateHandler {

    @Override
    public void handleText(IText text) {
        System.out.println("PreHandlerB 处理的文本: " + text + " 下一任处理者: " + this.getNext());
        super.handleText(text);
    }
}
