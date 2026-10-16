package finalsection;

import java.util.function.Consumer;

public class CallBack {
    static void main(String[] args) {

        hello("eredin",null,value -> {
            System.out.println("No last name Provided for " + value);
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }

    }
}
