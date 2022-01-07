package io.github.futurewl.others.process;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.IText;
import org.thymeleaf.processor.text.ITextProcessor;
import org.thymeleaf.processor.text.ITextStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

public class MyTextProcessor implements ITextProcessor {

    public TemplateMode getTemplateMode() {
        return TemplateMode.HTML;
    }

    public int getPrecedence() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void process(ITemplateContext context, IText text,
                        ITextStructureHandler structureHandler) {
        System.out.println("text processor: " + text);
    }
}
