package io.github.futurewl.tag;

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
        return 10;
    }

    public void process(ITemplateContext context, IText text,
                        ITextStructureHandler structureHandler) {
        String newText = text.getText().trim();
        structureHandler.setText(newText);
    }
}
