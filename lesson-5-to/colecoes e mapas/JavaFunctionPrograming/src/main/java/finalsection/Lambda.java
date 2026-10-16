package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {
    static void main(String[] args) {


        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            //logic
            if(name.isBlank()) throw new IllegalArgumentException("em branco");
            System.out.println("age " + age);
            return name.toUpperCase();
        };

        String name = upperCaseName.apply("EreDin",21);
        System.out.println(name);

    }
}
