package io.github.futurewl.others.process;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.IComment;
import org.thymeleaf.processor.comment.ICommentProcessor;
import org.thymeleaf.processor.comment.ICommentStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

public class MyCommentProcessor implements ICommentProcessor {

    public TemplateMode getTemplateMode() {
        return TemplateMode.HTML;
    }

    public int getPrecedence() {
        return 0;
    }

    public void process(ITemplateContext context, IComment comment,
                        ICommentStructureHandler structureHandler) {
        System.out.println("comment processor: " + comment);
    }

}
