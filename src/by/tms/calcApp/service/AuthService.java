package by.tms.calcApp.service;

import by.tms.calcApp.entity.HashSetUserManager;
import by.tms.calcApp.entity.User;
import by.tms.calcApp.entity.UserManager;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

public class AuthService {

    private static UserManager users = new HashSetUserManager();
    private static final User GUEST = new User("guest", "1234", "Guest");
    private static User currentUser = GUEST;

    public AuthService() {

    }

    public static UserManager getUsers() {
        return users;
    }

    public void setUsers(UserManager users) {
        AuthService.users = users;
    }

    public User getUser(String login) {
        return users.getUser(login);
    }

    public boolean logIn(User user, String pass) {
        boolean isLogIn = false;
        if(!user.getName().equals("Guest") && user.getPassword().equals(pass)) {
            currentUser = user;
            isLogIn = true;
        }

        return isLogIn;
    }

    public void logOut() {
        currentUser = GUEST;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void register(String login, String pass, String name) {
        users.addUser(new User(login, pass, name));
    }

}
