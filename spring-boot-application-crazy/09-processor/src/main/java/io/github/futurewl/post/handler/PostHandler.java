package io.github.futurewl.post.handler;

import org.thymeleaf.engine.AbstractTemplateHandler;
import org.thymeleaf.model.IText;

public class PostHandler extends AbstractTemplateHandler {

    @Override
    public void handleText(IText text) {
        System.out.println("PostHandler 处理的文本: " + text + " 下一任处理者: " + this.getNext());
        // 让责任链中的下一任处理者去执行
        super.handleText(text);
    }
}
