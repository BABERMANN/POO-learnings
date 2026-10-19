package Exceptions;

public class LoanLimitExceededException extends RentalException{
    public LoanLimitExceededException(String message) {
        super(message);
    }
}
