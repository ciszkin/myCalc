package by.tms.calcApp.entity;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -6270421014751285238L;
    private String login;
    private String password;
    private String name;
    private HistoryManager history;

    public User(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.history = new ArrayListHistoryManager();
    }

    public User() {    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HistoryManager getHistory() {
        return history;
    }

}