package app;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    List<User> users = Arrays.asList(
            new User(1000, "Valentin", "valentin@gmail.com"),
            new User(1001, "Olya", "olya@gmail.com"),
            new User(1002, "Katerina", "katerina@gmail.com"),
            new User(1003, "Vadim", "vadim@gmail.com")
    );

    private static int findUserById(int id) {

    }
}
