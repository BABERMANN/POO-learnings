package options;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        Predicate<String> isEmailValid = emailTest ->
                emailTest.contains("@");

                Optional.ofNullable(email)
                .filter(isEmailValid)
                .ifPresentOrElse(
                        emailOpt -> System.out.println("mandar email to " + emailOpt),
                        () -> System.out.println("Nao foi possivel mandar um email"));

    }
}
