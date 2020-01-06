package by.tms.calcApp.entity;

public class User {
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