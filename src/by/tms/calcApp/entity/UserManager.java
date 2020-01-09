package by.tms.calcApp.entity;

import java.io.Serializable;

public interface UserManager extends Serializable {
    void addUser(User user);
    User getUser(String login);
    void removeUser(User user);
}
