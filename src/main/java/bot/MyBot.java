package bot;

import java.util.Scanner;

public class MyBot {
    private String name;
    private Scanner scanner;

    public MyBot(String name, Scanner scanner) {
        this.name = name;
        this.scanner = scanner;
    }

    public void startSpeaking(String userName) {
        System.out.println("Hello,my name is " +
                name + " i was created to have conversation with you");
        System.out.println("How are you, " + userName + "?");
        String firstUserAnswer = scanner.nextLine();
        if (firstUserAnswer.contains("well") || firstUserAnswer.contains("fine")) {
            userIsFine();
        } else if (firstUserAnswer.contains("not") && firstUserAnswer.contains("bad")) {
            userIsNormal();
        } else if (firstUserAnswer.contains("bad")) {
            userIsBad();
        }
    }

    private void userIsFine() {
        System.out.println("That`s cool men, do you have any good news?");
        String userAnswer = scanner.nextLine();
        if (userAnswer.contains("no")) {
            noGoodNews();
        }
    }

    private void noGoodNews() {
        System.out.println("You have no good news? It`s uncool!");
    }

    private void haveGoodNews(){
        System.out.println("will you tell me about them");
        String userGoodNews = scanner.nextLine();
    }

    private void userIsNormal() {
        System.out.println("Do you have any  news ?");
        String userAnswer = scanner.nextLine();
        if (userAnswer.contains("no")) {
            System.out.println("no news is a good news!");
        } else if (userAnswer.length()> 15){
            System.out.println("Well, is cool news");

        } else if ( userAnswer.contains("yes")) {
            System.out.println("very interesting it s good news?");
            String isGoodNews = scanner.nextLine();
            if (isGoodNews.contains("yes")) {
                haveGoodNews();
            }else if(isGoodNews.contains("no")){
                noGoodNews();
            }

        }
    }

    private void userIsBad() {
        System.out.println("Don.t cry! Life is beautiful!");
        String userAnswer = scanner.nextLine();
        if (userAnswer.contains("yes") || userAnswer.contains("agree")) {
            System.out.println("it is good that are agree with me. So don t be upset");
        } else if (userAnswer.contains ("Not.It s mistake - life is very bad thing!")) {
            System.out.println("I hope you will understand - life is very good thing!");
        }
    }
}