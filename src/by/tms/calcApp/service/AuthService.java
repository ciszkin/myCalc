package by.tms.calcApp.service;

import by.tms.calcApp.entity.User;

import java.util.HashSet;
import java.util.Set;

public class AuthService {

    private static Set<User> users = new HashSet<>();
    private static final User GUEST = new User("guest", "1234", "Guest");
    private static User currentUser = GUEST;

    public User getUser(String login) {
        User user = GUEST;

        if (!users.isEmpty()) {
            for (User u : users) {
                if (u.getLogin().equals(login)) {
                    user = u;
                    break;
                }
            }
        }

        return user;
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
        users.add(new User(login, pass, name));
    }

}
