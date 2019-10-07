package io.github.futurewl;

public class MyTranslator {

    public static String testTrans(String sourceName) {
        System.out.println("要转换的数据：" + sourceName);
        return sourceName.toUpperCase();
    }
}
