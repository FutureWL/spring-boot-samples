package io.github.futurewl.spring.aw.demo3;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:17:26
 * @version 1.0
 */
public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    public TextEditor(SpellChecker spellChecker, String name) {
        this.spellChecker = spellChecker;
        this.name = name;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public String getName() {
        return name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
