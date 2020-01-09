package by.tms.calcApp.entity;

import java.io.Serializable;
import java.util.HashSet;

public class HashSetUserManager implements UserManager, Serializable {
    private static final long serialVersionUID = 7511424576462199006L;
    HashSet<User> users = new HashSet<>();

    public HashSetUserManager() {
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User getUser(String login) {
        User user = null;
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

    @Override
    public void removeUser(User user) {
        users.remove(user);
    }
}
