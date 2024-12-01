package app;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private final List<User> users = Arrays.asList(
            new User(1000, "Valentin", "valentin@gmail.com"),
            new User(1001, "Olya", "olya@gmail.com"),
            new User(1002, "Katerina", "katerina@gmail.com"),
            new User(1003, "Vadim", "vadim@gmail.com")
    );

    private Optional<User> findUserById(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst();
    }

    private Optional<User> findUserByEmail(String email) {
        return users.stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }

    private Optional<List<User>> findAllUsers() {
        if (users.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(users);
        }
    }

    public Optional<User> getFindUserById(int id) {
        return findUserById(id);
    }

    public Optional<User> getFindUserByEmail(String email) {
        return findUserByEmail(email);
    }

    public Optional<List<User>> getFindAllUsers() {
        return findAllUsers();
    }
}
