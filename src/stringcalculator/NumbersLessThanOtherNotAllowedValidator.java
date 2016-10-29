package stringcalculator;

import stringcalculator.exception.NegativeNotAllowedValidationException;
import stringcalculator.exception.ValidationException;

import java.util.List;

public class NumbersLessThanOtherNotAllowedValidator implements StringCalculator.Validator {
    private final int limit;

    public NumbersLessThanOtherNotAllowedValidator(int limit) {
        this.limit = limit;
    }

    @Override
    public void validateNumbers(List<Integer> numbers) throws ValidationException {
        for (int number : numbers) {
            if (number < this.limit) {
                throw new NegativeNotAllowedValidationException();
            }
        }
    }
}
