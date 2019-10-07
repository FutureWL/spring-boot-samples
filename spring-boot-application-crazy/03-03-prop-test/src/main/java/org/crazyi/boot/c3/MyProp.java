package org.crazyi.boot.c3;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "jdbc")
public class MyProp {

    private String url;

    private String user;

    private String password;

    private Database db;

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }

    public static class Database {
        private String name;
        private String version;
        private List<String> roles;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            this.roles = roles;
        }

    }
}
