package io.github.futurewl.bondary;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.ITemplateEnd;
import org.thymeleaf.model.ITemplateStart;
import org.thymeleaf.processor.templateboundaries.ITemplateBoundariesProcessor;
import org.thymeleaf.processor.templateboundaries.ITemplateBoundariesStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

public class MyBoundariesProcessor implements ITemplateBoundariesProcessor {

    public TemplateMode getTemplateMode() {
        return TemplateMode.HTML;
    }

    public int getPrecedence() {
        return 0;
    }

    /**
     * 该方法将会在所有的一般处理器前面执行
     */
    public void processTemplateStart(ITemplateContext context,
                                     ITemplateStart templateStart,
                                     ITemplateBoundariesStructureHandler structureHandler) {
        System.out.println("===========  start");
    }

    /**
     * 该方法将会在所有的一般处理器后面执行
     */
    public void processTemplateEnd(ITemplateContext context,
                                   ITemplateEnd templateEnd,
                                   ITemplateBoundariesStructureHandler structureHandler) {
        System.out.println("===========  end");
    }
}
