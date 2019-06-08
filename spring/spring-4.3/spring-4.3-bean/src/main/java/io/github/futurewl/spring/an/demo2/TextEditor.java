package io.github.futurewl.spring.an.demo2;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:17:37
 * @version 1.0
 */
public class TextEditor {
    private SpellChecker spellChecker;

    @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
