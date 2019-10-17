package services;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import entities.Message;
import entities.User;
import repositories.MessageRepository;

import java.util.Scanner;

public class MessageServiceImpl implements MessageService {
    private MessageRepository mr;
    private Scanner sc;

    public MessageServiceImpl(Scanner sc) {
        this.mr = new MessageRepository();
        this.sc = sc;
    }

    @Override
    public void writeNewMessage(User authorOfMessage) {
        System.out.println("Write new message");
        String newMessage = sc.next();
        Message message = new Message(authorOfMessage, newMessage);
        mr.addMessage(message);

    }

    @Override
    public void editMessageById(long id) {
        System.out.println("edit new text for your  message with id ");
        String newText = sc.nextLine();
        mr.editMessageById(id, newText);
    }

    @Override
    public void deleteMassageById() {
        System.out.println("Enter id of message which you are want to remove");
        long idDel = sc.nextLong();
        mr.deleteMessageById(idDel);
    }

    /*public void writeNewMessage(User user) {
        System.out.println("Enter text of message");
        String newMessage = sc.nextLine();
        Message mg = new Message(user, newMessage);
        mr.addMessage(mg);
    }*/

    /**
     * 1.написать метод deleteMessage который будет в себя принимать Message как параметр и удалять его из репозитория
     * 2.1 Добавить поле id в клас Message (это должно быть целове чило)
     * 2.2 Написать в месадж репозиторие метод который будет возвращать месседж по его id
     * 2.3 написать метод editMessage которий будет принимать в себя параметр id, брать из репозитори сообщене с этим id
     * и сенять в нем текст (через сканер)
     */
    /*public void editMessage(long id) {
        System.out.println("Enter new text of message:");
        String newTextMessage = sc.next();
        mr.getMessageById(id).setText(newTextMessage);
    }*/

}


