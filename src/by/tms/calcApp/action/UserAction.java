package by.tms.calcApp.action;

import by.tms.calcApp.entity.User;
import by.tms.calcApp.service.IOService;
import by.tms.calcApp.util.ConsoleReader;
import by.tms.calcApp.util.ConsoleWriter;
import by.tms.calcApp.util.Reader;
import by.tms.calcApp.util.Writer;
import by.tms.calcApp.service.AuthService;

public class UserAction {

    private Reader reader = new ConsoleReader();
    private Writer writer = new ConsoleWriter();

    private AuthService authService = new AuthService();
    private IOService ioService = new IOService();

    public void init() {
        authService.setUsers(ioService.loadUsers());
    }

    public void end() {
        ioService.saveUsers(AuthService.getUsers());
    }

    public void register() {

        int registered = 0;
        String login = "";
        String pass = "";
        String name = "";

        while(registered < 4) {
            switch (registered) {
                case 0:
                    writer.write("Enter your login:");
                    login = reader.read();
                    //if (!"Guest".equals(authService.getUser(login).getName())) {
                    if(authService.getUser(login) != null) {
                        writer.write("This login is already used! Try another!");
                    } else {
                        registered++;
                    }
                    break;
                case 1:
                    writer.write("Enter new password:");
                    pass = reader.read();
                    registered++;
                    break;
                case 2:
                    writer.write("Please, confirm your password:");
                    if(reader.read().equals(pass)) {
                        registered++;
                    } else {
                        writer.write("Wrong password! Try again!");
                    }
                    break;
                case 3:
                    writer.write("Enter your name:");
                    name = reader.read();
                    registered++;
                    break;
            }
        }

        authService.register(login, pass, name);

        writer.write("Congratulations," + name + "! Now you are registered user of our ConsoleCalculator!");
        writer.write("Now log in to start using fully featured application!");
    }

    public void logOut() {
        writer.write("Goodbye," + authService.getCurrentUser().getName() + "! See you later!");
        authService.logOut();
    }

    public void logIn() {

        if (authService.getCurrentUser().getName().equals("Guest")) {
            writer.write("Enter your login:");
            String login = reader.read();

            User user = authService.getUser(login);

            if(user.getLogin().equals("guest")) {
                writer.write("You are not registered in our ConsoleCalculator!");
            } else {
                for(int t = 3; t > 0; t--) {
                    writer.write("Enter your password: ");
                    String pass = reader.read();
                    if (authService.logIn(user, pass)) {
                        writer.write("Welcome to our ConsoleCalculator, " + user.getName() + "! Have a nice calculations!");
                        break;
                    } else {
                        writer.write("Wrong password! " + (t - 1) + " attempts left.");
                    }
                }
            }
        } else {
            writer.write("Another registered user is log in now. To change user, please, log out first!");
        }
    }

    public void editProfile() {
        if (!authService.getCurrentUser().getLogin().equals("guest")) {
            int edited = 0;
            String pass = "";
            String name = "";

            writer.write("To change profile data enter new values. To keep it without changes press [Enter].");

            while(edited < 3) {

                switch (edited) {
                    case 0:
                        writer.write("Enter new password:");
                        pass = reader.read();
                        edited++;
                        break;
                    case 1:
                        if (!pass.equals("")) {
                            writer.write("Please, confirm your password:");
                            if(reader.read().equals(pass)) {
                                authService.getCurrentUser().setPassword(pass);
                                edited++;
                            } else {
                                writer.write("Wrong password! Try again!");
                            }
                            break;
                        } else {
                            edited++;
                        }
                    case 2:
                        writer.write("Enter your name:");
                        name = reader.read();
                        if(!name.equals("")) {
                            authService.getCurrentUser().setName(name);
                        }
                        edited++;
                        break;
                }
            }
            writer.write("Profile data successfully changed!");
        } else {
            writer.write("Guests can not change their profiles!");
        }
    }
}
