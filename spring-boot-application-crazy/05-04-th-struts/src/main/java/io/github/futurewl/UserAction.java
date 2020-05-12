package io.github.futurewl;

import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class UserAction extends ActionSupport {

    private List<User> users;

    @Override
    public String execute() throws Exception {
        this.users = createUsers();
        return SUCCESS;
    }

    /**
     * 获取用户数据
     */
    private List<User> createUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "User A"));
        users.add(new User(2, "User B"));
        users.add(new User(3, "User C"));
        return users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
