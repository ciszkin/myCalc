package by.tms.calcApp.service;

import by.tms.calcApp.entity.HashSetUserManager;
import by.tms.calcApp.entity.UserManager;
import java.io.*;


public class IOService {


    public void saveUsers(UserManager users) {
        try {
            ObjectOutputStream usersFile = new ObjectOutputStream(new FileOutputStream("users.txt"));
            usersFile.writeObject(users);
            usersFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public UserManager loadUsers() {
        UserManager users = new HashSetUserManager();

        try {
            ObjectInputStream usersFile = new ObjectInputStream((new FileInputStream("users.txt")));

            users = (UserManager) usersFile.readObject();
            usersFile.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return users;
    }
}
