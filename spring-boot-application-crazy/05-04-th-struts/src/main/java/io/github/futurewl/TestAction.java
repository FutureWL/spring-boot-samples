package io.github.futurewl;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

    public String execute() throws Exception {
        System.out.println("struts2 action");
        return SUCCESS;
    }
}
