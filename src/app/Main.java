package app;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();

        int id = 1000;
        String email = "olya@gmail.com";

        System.out.println(userRepository.getFindUserById(id)
                .map(user -> "\nЗа цим ID знайдено користувача: " + user)
                .orElse("\nКористувача з ID " + id + " не знайдено :("));

        System.out.println(userRepository.getFindUserByEmail(email)
                .map(user -> "\nЗа цим e-mail знайдено користувача: " + user)
                .orElse("\nКористувач з e-mail " + email + " не знайдено :("));

        System.out.println(userRepository.getFindAllUsers()
                .map(users -> "\nВсі користувачі: " + users.stream()
                        .map(User::toString)
                        .collect(Collectors.joining("\n")))
                .orElse("\nКористувачів не знайдено"));
    }
}
