package io.github.futurewl.pre.handler;

import org.thymeleaf.engine.AbstractTemplateHandler;
import org.thymeleaf.model.ITemplateEnd;
import org.thymeleaf.model.ITemplateStart;
import org.thymeleaf.model.IText;

public class PreHandlerA extends AbstractTemplateHandler {

    @Override
    public void handleText(IText text) {
        System.out.println("PreHandlerA 处理的文本: " + text + " 下一任处理者: " + this.getNext());
        // 让责任链中的下一任处理者去执行
        super.handleText(text);
    }

    @Override
    public void handleTemplateStart(ITemplateStart templateStart) {
        // TODO Auto-generated method stub
        super.handleTemplateStart(templateStart);
    }

    @Override
    public void handleTemplateEnd(ITemplateEnd templateEnd) {
        // TODO Auto-generated method stub
        super.handleTemplateEnd(templateEnd);
    }

}
