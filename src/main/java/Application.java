import entities.User;
import services.MessageService;
import services.UserService;

import java.util.Scanner;

public class Application {
    private MessageService ms;
    private UserService us;
    private Scanner sc;
    private User user;

    public Application() {
        this.sc = new Scanner(System.in);
        this.ms = new MessageService(sc);
        this.us = new UserService(sc);
        this.user = new User("user", "");
    }

    private void sighIn() {
        System.out.println("Enter your login");
        String login = sc.next();
        System.out.println("Enter you password");
        String password = sc.next();
        this.user = new User(login, password);
    }

    public boolean start() {
        do {
            System.out.println("Hello," + user.getLogin() + ". What would you like to do?");
            System.out.println("Press 1 to log in.");
            System.out.println("Press 2 wright new message to the forum.");
            System.out.println("Press 9 to exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    sighIn();
                    break;
                case 2:
                    ms.writeNewMessage(user);
                    break;
                case 9:
                    return true;
            }
        } while (true);
    }


}
