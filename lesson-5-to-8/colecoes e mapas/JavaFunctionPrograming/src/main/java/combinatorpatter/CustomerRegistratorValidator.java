package combinatorpatter;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegistratorValidator extends Function<Customer, CustomerRegistratorValidator.ValidationResult> {

    static CustomerRegistratorValidator isEmailValid() {
        System.out.println("RUNNING EMAIL VALIDATOR");
        return customer -> customer.getEmail().contains("@") ?
                ValidationResult.SUCSESS : ValidationResult.EMAIL_NOT_VALID;
    }

    static CustomerRegistratorValidator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().length() == 14 ?
                ValidationResult.SUCSESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistratorValidator isAdult() {
        return customer -> Period.between(customer.getDateOfBirth(), LocalDate.now()).getYears() >= 18 ?
                ValidationResult.SUCSESS : ValidationResult.IS_NOT_AN_ADULT;
    }

    default CustomerRegistratorValidator and (CustomerRegistratorValidator other){
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(ValidationResult.SUCSESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult{
        SUCSESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
