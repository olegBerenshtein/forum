package services;

import entities.User;
import repositories.UserRepository;

import java.util.Scanner;

public class UserServiceImpl implements UserService{
    private UserRepository ur;
    private Scanner scanner;

    public UserServiceImpl(Scanner scanner) {
        this.ur = new UserRepository();
        this.scanner=scanner;

    }
    public void renameUser(User userForRename) {
        System.out.println("Enter new name");
        String newName = scanner.next();
        userForRename.setLogin(newName);
    }
    public void setNewPasswordToUser ( User userForNewPassword) {
        System.out.println("Enter new password");
        String newPassword = scanner.next();
        userForNewPassword.setPassword(newPassword);
    }


    @Override
    public User saveUser(User user) {
        ur.addUser(user);
        return user;
    }

    @Override
    public User findUserByLogin(String login) {
        return ur.getUserByLogin(login);
    }

    @Override
    public boolean isRegister(String login, String password) {
        User user = new User(login,password);
        return ur.contains(user);
    }
}
