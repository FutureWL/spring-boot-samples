package io.github.futurewl.ele;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.engine.AttributeNames;
import org.thymeleaf.engine.ElementName;
import org.thymeleaf.engine.ElementNames;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.IElementTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.processor.element.MatchingAttributeName;
import org.thymeleaf.processor.element.MatchingElementName;
import org.thymeleaf.templatemode.TemplateMode;

public class MyTagProcessor implements IElementTagProcessor {

    /**
     * 返回匹配的节点名称，例如返回div，则只处理模板中的div节点
     */
    public MatchingElementName getMatchingElementName() {
        ElementName eleName = ElementNames.forHTMLName("div");
        MatchingElementName mEleName = MatchingElementName.forElementName(
                getTemplateMode(), eleName);
        return mEleName;
    }

    /**
     * 根据属性匹配节点，节点中含有 crazy:test 属性的节点都会被匹配到
     */
    public MatchingAttributeName getMatchingAttributeName() {
        AttributeName attName = AttributeNames.forHTMLName("crazy", "test");
        MatchingAttributeName mAttName = MatchingAttributeName
                .forAttributeName(getTemplateMode(), attName);
        return mAttName;
    }

    /**
     * 返回模板模式
     */
    public TemplateMode getTemplateMode() {
        return TemplateMode.HTML;
    }

    /**
     * 返回处理器优先级
     */
    public int getPrecedence() {
        return 0;
    }

    public void process(ITemplateContext context, IProcessableElementTag tag,
                        IElementTagStructureHandler structureHandler) {
        System.out.println(tag.getClass());
        // 处理单个节点，节点类型为 OpenElementTag 或者 StandaloneElementTag
//        String crazyValue = tag.getAttributeValue("crazy:test");
//        structureHandler.setAttribute("th:text", crazyValue);
//        structureHandler.setBody("test", true);
//        structureHandler.removeAllButFirstChild();
//        List<String> names = (List<String>)context.getVariable("names");
//        structureHandler.iterateElement("userName", "u", names);
    }
}
