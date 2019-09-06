package io.github.futurewl.di.demo2;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:17:07
 * @version 1.0
 */
public class TextEditor {

    private SpellChecker spellChecker;

    // a setter method to inject the dependency.
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker.");
        this.spellChecker = spellChecker;
    }

    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
