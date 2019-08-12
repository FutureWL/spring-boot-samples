package io.github.futurewl.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by sang on 2018/7/5.
 */
@Component
@ConfigurationProperties(prefix = "my")
public class Users {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
