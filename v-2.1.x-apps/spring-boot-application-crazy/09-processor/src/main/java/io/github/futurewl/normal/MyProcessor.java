package io.github.futurewl.normal;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.IText;
import org.thymeleaf.processor.text.ITextProcessor;
import org.thymeleaf.processor.text.ITextStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

public class MyProcessor implements ITextProcessor {

    public TemplateMode getTemplateMode() {
        return TemplateMode.HTML;
    }

    public int getPrecedence() {
        return 0;
    }

    public void process(ITemplateContext context, IText text,
                        ITextStructureHandler structureHandler) {
        // 将字符串替换为abc
        if (text != null && !text.getText().trim().equals("")) {
            structureHandler.setText("abc");
        }
    }
}
