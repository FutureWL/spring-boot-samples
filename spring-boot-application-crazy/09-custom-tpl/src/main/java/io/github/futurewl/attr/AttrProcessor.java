package io.github.futurewl.attr;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.engine.AttributeNames;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.IElementTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.processor.element.MatchingAttributeName;
import org.thymeleaf.processor.element.MatchingElementName;
import org.thymeleaf.standard.expression.IStandardExpression;
import org.thymeleaf.standard.expression.IStandardExpressionParser;
import org.thymeleaf.standard.expression.StandardExpressions;
import org.thymeleaf.templatemode.TemplateMode;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AttrProcessor implements IElementTagProcessor {

    /**
     * 返回匹配的节点名称
     */
    public MatchingElementName getMatchingElementName() {
        return null;
    }

    /**
     * 根据属性匹配节点，节点中含有test 属性的节点都会被匹配到
     */
    public MatchingAttributeName getMatchingAttributeName() {
        AttributeName attName = AttributeNames.forHTMLName("crazy", "format");
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
        String expressionValue = tag.getAttributeValue("crazy:format");
        // 解析表达式
        final IStandardExpression expression = expressionParser
                .parseExpression(context, expressionValue);
        // 执行表达式
        final Object value = expression.execute(context);
        if (value instanceof Date) {
            // 转换为Date
            Date date = (Date) value;
            // 设置body
            String dateStr = formatDate(date);
            // 设置节点体
            structureHandler.setBody(dateStr, false);
            // 移除crazy:format属性
            structureHandler.removeAttribute("crazy:format");
        }
    }

    // 日期格式 
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private String formatDate(Date date) {
        try {
            return sdf.format(date);
        } catch (Exception e) {
            return date.toString();
        }
    }
}
