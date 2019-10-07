package io.github.futurewl;

public class User {

    private Integer id;

    private String name;

    private Parent parent;

    public User() {
        super();
    }

    public User(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public void printUser(Integer id, String name) {
        System.out.println("User类的print方法：" + id + ", " + name);
    }
}
