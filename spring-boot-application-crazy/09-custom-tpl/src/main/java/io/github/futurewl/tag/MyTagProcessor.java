package io.github.futurewl.tag;

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
import org.thymeleaf.standard.expression.IStandardExpression;
import org.thymeleaf.standard.expression.IStandardExpressionParser;
import org.thymeleaf.standard.expression.StandardExpressions;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.util.EvaluationUtils;

public class MyTagProcessor implements IElementTagProcessor {

    /**
     * 返回匹配的节点名称
     */
    public MatchingElementName getMatchingElementName() {
        ElementName eleName = ElementNames.forHTMLName("c:if");
        MatchingElementName mEleName = MatchingElementName.forElementName(
                getTemplateMode(), eleName);
        return mEleName;
    }

    /**
     * 根据属性匹配节点，节点中含有test 属性的节点都会被匹配到
     */
    public MatchingAttributeName getMatchingAttributeName() {
        AttributeName attName = AttributeNames.forHTMLName("", "test");
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

    /**
     * 处理<c:if test>的节点
     */
    public void process(ITemplateContext context, IProcessableElementTag tag,
                        IElementTagStructureHandler structureHandler) {
        // 创建表达式解析器
        IStandardExpressionParser expressionParser = StandardExpressions
                .getExpressionParser(context.getConfiguration());
        // 获取属性值
        String expressionValue = tag.getAttributeValue("test");
        // 解析表达式
        final IStandardExpression expression = expressionParser
                .parseExpression(context, expressionValue);
        // 执行表达式
        final Object value = expression.execute(context);
        // 将结果转换为boolean
        boolean result = EvaluationUtils.evaluateAsBoolean(value);
        // 处理节点
        if (result) {
            // 结果为true，仅仅删除标签
            structureHandler.removeTags();
        } else {
            // 结果为false，删除整个节点
            structureHandler.removeElement();
        }
    }
}
