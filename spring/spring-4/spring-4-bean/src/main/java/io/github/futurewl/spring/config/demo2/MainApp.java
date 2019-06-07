package io.github.futurewl.spring.config.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:19:24
 * @version 1.0
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor te = ctx.getBean(TextEditor.class);

        te.spellCheck();
    }
}
