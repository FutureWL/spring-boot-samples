package io.github.futurewl;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:22:09
 * @version 1.0
 */
public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
