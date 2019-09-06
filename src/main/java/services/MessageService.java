package services;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import entities.Message;
import entities.User;
import repositories.MessageRepository;

import java.util.Scanner;

public class MessageService {
    private MessageRepository mr;
    private Scanner sc;

    public MessageService(Scanner sc) {
        this.mr = new MessageRepository();
        this.sc = sc;
    }

    public void writeNewMessage(User user) {
        System.out.println("Enter text of message");
        String newMessage = sc.nextLine();
        Message mg = new Message(user, newMessage);
        mr.addMessage(mg);
    }

    /**
     * 1.написать метод deleteMessage который будет в себя принимать Message как параметр и удалять его из репозитория
     * 2.1 Добавить поле id в клас Message (это должно быть целове чило)
     * 2.2 Написать в месадж репозиторие метод который будет возвращать месседж по его id
     * 2.3 написать метод editMessage которий будет принимать в себя параметр id, брать из репозитори сообщене с этим id
     * и сенять в нем текст (через сканер)
     */
    public void editMessage(long id) {
        System.out.println("Enter new text of message:");
        String newTextMessage = sc.next();
        mr.getMessageById(id).setText(newTextMessage);
    }

}


