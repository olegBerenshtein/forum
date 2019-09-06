import bot.MyBot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Application application = new Application();
        application.start();*/
        Scanner scanner = new Scanner(System.in);
        MyBot myBot = new MyBot("Bot",scanner);
        myBot.startSpeaking("Mike");
    }
}
