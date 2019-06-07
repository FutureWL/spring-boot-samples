package io.github.futurewl.spring.demo7;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:16:36
 * @version 1.0
 */
public class HelloWorld {
    private String message1;
    private String message2;

    public void setMessage1(String message) {
        this.message1 = message;
    }

    public void setMessage2(String message) {
        this.message2 = message;
    }

    public void getMessage1() {
        System.out.println("World Message1 : " + message1);
    }

    public void getMessage2() {
        System.out.println("World Message2 : " + message2);
    }
}
