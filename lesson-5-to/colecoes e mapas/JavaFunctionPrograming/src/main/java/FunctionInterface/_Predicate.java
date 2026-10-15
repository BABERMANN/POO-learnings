package FunctionInterface;

import java.util.function.Predicate;

public class _Predicate {

    //psvma
    static void main(String[] args) {

        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("090430000000") + "\n");
        String phone = "07000000000";
        String phone2 = "07300000000";
        String phone3 = "0730000000";

        System.out.println("Using Predicate:");
        System.out.println(isPhoneNumberValidPredicate.test(phone));

        System.out.println("Este telefone é valido e contem o numero 3?");
        System.out.println(isPhoneNumberValidPredicate
                .and(contaisNumber)
                .test(phone2) + "\n");

        System.out.println("Esse telefone é valido OU contem numero 3");
        System.out.println(isPhoneNumberValidPredicate.or(contaisNumber).test(phone3));


    }

    //methods

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static  Predicate<String> contaisNumber = phone ->
            phone.contains("3");


    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

}
