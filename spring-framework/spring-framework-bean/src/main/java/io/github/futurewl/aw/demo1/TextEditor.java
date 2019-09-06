package io.github.futurewl.aw.demo1;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:17:26
 * @version 1.0
 */
public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
