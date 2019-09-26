package services;

import entities.User;

public interface UserService {
    User saveUser(User user);

    User findUserByLogin(String login);

    boolean isRegister(String login, String password);
}
