package services;

import entities.User;

public interface MessageService {
    void writeNewMessage(User user);

    void editMessageById(long id);

    void deleteMassageById();
}
