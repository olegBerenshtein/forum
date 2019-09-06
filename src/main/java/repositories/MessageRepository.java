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

    public Message getMessageById(long idInp){
        return messages.stream()
                .filter(message -> message.getId()==idInp)//вместо == .equals(то с чем сравниваем)
                .findFirst()
                .get();
    }
}
