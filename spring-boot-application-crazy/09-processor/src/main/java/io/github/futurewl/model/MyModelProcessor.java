package io.github.futurewl.model;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.IModel;
import org.thymeleaf.processor.element.IElementModelProcessor;
import org.thymeleaf.processor.element.IElementModelStructureHandler;
import org.thymeleaf.processor.element.MatchingAttributeName;
import org.thymeleaf.processor.element.MatchingElementName;
import org.thymeleaf.templatemode.TemplateMode;

/**
 * 自定义模型处理器
 */
public class MyModelProcessor implements IElementModelProcessor {

    /**
     * 两个节点匹配方法返回null，表示将会处理所有节点
     */
    public MatchingElementName getMatchingElementName() {
        return null;
    }

    public MatchingAttributeName getMatchingAttributeName() {
        return null;
    }

    public TemplateMode getTemplateMode() {
        return TemplateMode.HTML;
    }

    public int getPrecedence() {
        return 0;
    }

    public void process(ITemplateContext context, IModel model,
                        IElementModelStructureHandler structureHandler) {
        for (int i = 0; i < model.size(); i++) {
            System.out.println(model.get(i).getClass().getName() + ": "
                    + model.get(i));
        }
    }
}
