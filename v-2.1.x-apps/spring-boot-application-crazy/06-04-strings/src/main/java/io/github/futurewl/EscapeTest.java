package io.github.futurewl;

import org.unbescape.html.HtmlEscape;
import org.unbescape.java.JavaEscape;
import org.unbescape.java.JavaEscapeLevel;
import org.unbescape.javascript.JavaScriptEscape;

public class EscapeTest {

    public static void main(String[] args) {
        /*
         * 对Java语句进行编码和解码，级别3，字母（大小写）与数字不会进行编码，其他字符都会编 码
         */
        String result = JavaEscape.escapeJava("System.out.println('你好');",
                JavaEscapeLevel.LEVEL_3_ALL_NON_ALPHANUMERIC);
        System.out.println(result);
        // 解码
        String unResult = JavaEscape.unescapeJava(result);
        System.out.println(unResult);
        /*
         * 对HTML进行编码和解码
         */
        result = HtmlEscape.escapeHtml4Xml("<div>test</div>");
        System.out.println(result);
        // 解码
        unResult = HtmlEscape.unescapeHtml(result);
        System.out.println(unResult);
        /*
         * 对JavaScript进行编码和解码，默认级别为2，对非ASCII等字符（例如中文）进行编码
         */
        result = JavaScriptEscape
                .escapeJavaScript("var test = function() { alert('你好'); }");
        System.out.println(result);
        // 解码
        unResult = JavaScriptEscape.unescapeJavaScript(result);
        System.out.println(unResult);
    }

}
