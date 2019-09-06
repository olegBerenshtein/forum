package services;

import entities.User;
import repositories.UserRepository;

import java.util.Scanner;

public class UserService{
    private UserRepository ur;
    private Scanner scanner;

    public UserService (Scanner scanner) {
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


}
