package combinatorpatter;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
        Customer Eredin = new Customer("Eredin",
                "eredin@gmail.com",
                "(19)92929-2932",
                LocalDate.of(2005,2,2));


        //combinator patter
        CustomerRegistratorValidator.ValidationResult result = CustomerRegistratorValidator
                .isEmailValid()
                .and(CustomerRegistratorValidator.isPhoneNumberValid())
                .and(CustomerRegistratorValidator.isAdult())
                .apply(Eredin);


        if(result != CustomerRegistratorValidator.ValidationResult.SUCSESS){
            throw new IllegalArgumentException(result.name());

    }
}
}
