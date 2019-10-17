package repositories;

import entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users;

    public UserRepository() {
        this.users = new ArrayList<User>();
        users.add(new User("mike","1234"));
        users.add(new User("oleg","1234"));
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void deleteUser(String loginInp) {
        users.removeIf(user -> user.getLogin().equals(loginInp));
    }

    public void showUser() {
        users.forEach(System.out::println);
    }

    public boolean contains(User checkableUser) {
        for (User user : users) {
            if (user.getLogin().equals(checkableUser.getLogin())
                    && user.getPassword().equals(checkableUser.getPassword()))
                return true;
        }
        return false;
    }

    public User getUserByLogin(String loginInp) {
        return users.stream()
                .filter(user -> user.getLogin().equals(loginInp))
                .findFirst()
                .get();
    }
}
// создать метод getUserByLogin который должен принимать в себя String login и возвращать юзера с этим логином

