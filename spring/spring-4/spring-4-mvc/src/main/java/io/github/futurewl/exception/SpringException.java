package io.github.futurewl.exception;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:21:47
 * @version 1.0
 */
public class SpringException extends RuntimeException {

    private String exceptionMsg;

    public SpringException(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg() {
        return this.exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }
}
