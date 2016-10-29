package stringcalculator.exception;

public class NegativeNotAllowedValidationException extends ValidationException {
    @Override
    public String getMessage() {
        return "negatives not allowed";
    }
}
