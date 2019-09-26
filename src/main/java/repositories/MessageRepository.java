package repositories;

import entities.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageRepository {
    private List<Message> messages;

    public MessageRepository() {
        this.messages = new ArrayList<Message>();
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public void showMessage() {
        for (int a = 0; a < messages.size(); a++) {
            System.out.println(messages.get(a));
        }
    }

    public void deleteMessage(Message mg) {
        messages.remove(mg);
    }
    public void deleteMessageById (long id) {
        messages.removeIf( message->message.getId() == id);
    }

    public Message getMessageById(long idInp) {
        return messages.stream()
                .filter(message -> message.getId() == idInp)//вместо == .equals(то с чем сравниваем)
                .findFirst()
                .get();
    }

    public void editMessageById(long id, String newTextOfMessage) {
//        for (int i = 0;i<messages.size();i++) {
//                if(messages.get(i).getId()== id) {
//                    messages.get(i).setText(newTextOfMessage);
//                }
//        }
        messages.stream()
                .filter(message -> message.getId() == id)
                .forEach(message -> message.setText(newTextOfMessage));
    }
}
