package bot;

import java.util.Scanner;

public class MyBot {
    private String name;
    private Scanner scanner;

    public MyBot(String name, Scanner scanner) {
        this.name = name;
        this.scanner = scanner;
    }

    public void startSpeaking (String userName) {
        System.out.println("Hello,my name is " + name + "i was created to have conversation with you");
        System.out.println("How are you, " + userName + "?");
        String firstUserAnswer = scanner.nextLine();
        if (firstUserAnswer.contains("well") || firstUserAnswer.contains("fine")) {
            userIsFine();
        } else if (firstUserAnswer.contains("not") && firstUserAnswer.contains("bad")) {
            userIsNormal();
        }
    }

    private void userIsFine(){
        System.out.println("That`s cool men, do you have any good news?");
        String userAnswer = scanner.nextLine();
        if(userAnswer.contains("no")){
            noGoodNews();
        }
    }

    private void noGoodNews(){
        System.out.println("You have no good news? It`s uncool!");
    }

    private void userIsNormal () {
        System.out.println("Do you have any  news ?");
        String userAnswer = scanner.nextLine();
        if(userAnswer.contains("no")){
            System.out.println("no news is a good news!");
        }
    }
}
