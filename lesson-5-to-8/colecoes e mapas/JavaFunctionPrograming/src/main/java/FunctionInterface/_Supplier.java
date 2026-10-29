package FunctionInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    static void main(String[] args) {
        System.out.println(getConnectionUrl());
        System.out.println();
        System.out.println(getConnectionSuplier.get());

        System.out.println(getGitHubConnetion.get());
    }

    static String getConnectionUrl(){
        return "https://github.com/BAEBERMANN";
    }

    static Supplier<String> getConnectionSuplier = () ->  "https://github.com/BAEBERMANN";

    static Supplier<List<String>> getGitHubConnetion = () ->
            List.of("https://github.com/BAEBERMANN",
                    "https://github.com/APOLOCODE",
                    "https://github.com/SEXCODE",
                    "https://github.com/POOLEARNIGS",
                    "https://github.com/EREDINCODEX");



}
