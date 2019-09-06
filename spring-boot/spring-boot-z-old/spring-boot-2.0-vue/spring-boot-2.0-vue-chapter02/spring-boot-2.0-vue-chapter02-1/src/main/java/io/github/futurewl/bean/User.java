package io.github.futurewl.bean;

import java.util.List;

/**
 * Created by sang on 2018/7/5.
 */
public class User {
    private String name;
    private String address;
    private List<String> favorites;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", favorites=" + favorites +
                '}';
    }
}
