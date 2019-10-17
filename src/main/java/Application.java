import bot.MyBot;
import entities.User;
import services.MessageServiceImpl;
import services.UserServiceImpl;

import java.util.Scanner;

public class Application {
    private MessageServiceImpl ms;
    private UserServiceImpl us;
    private Scanner sc;
    private User user;
    private MyBot bot;

    public Application() {
        this.sc = new Scanner(System.in);
        this.ms = new MessageServiceImpl(sc);
        this.us = new UserServiceImpl(sc);
        this.user = new User("user", "");
        this.bot = new MyBot("alex", sc);
    }

    private void sighIn() {
        System.out.println("Enter your login");
        String login = sc.next();
        System.out.println("Enter you password");
        String password = sc.next();
        if(us.isRegister(login,password)){
            this.user = new User(login, password);
        }else {
            System.out.println("Wrong login or password");
        }
    }

    public boolean start() {
        do {
            System.out.println("Hello," + user.getLogin() + ". What would you like to do?");
            System.out.println("Press 1 to log in.");
            System.out.println("Press 2 wright new message to the forum.");
            System.out.println("Press 6 to have a conversation with our bot");
            System.out.println("Press 8 to see all the users");
            System.out.println("Press 9 to exit");


            int input = sc.nextInt();
            switch (input) {
                case 1:
                    sighIn();
                    break;
                case 2:
                    ms.writeNewMessage(user);
                    break;
                case 6:
                    bot.startSpeaking(user.getLogin());
                    break;
                case 8:
                    us.showAllUsers();
                    break;
                case 9:
                    return true;
                default:
                    System.out.println("you have pressed wrong number -" + input);
            }
        } while (true);
    }


}
