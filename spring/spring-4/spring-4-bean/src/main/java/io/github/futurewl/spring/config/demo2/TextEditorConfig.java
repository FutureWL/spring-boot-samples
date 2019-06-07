package io.github.futurewl.spring.config.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:19:23
 * @version 1.0
 */
@Configuration
public class TextEditorConfig {

    @Bean
    public TextEditor textEditor() {
        return new TextEditor(spellChecker());
    }

    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }
}
