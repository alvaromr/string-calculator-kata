package stringcalculator;

import stringcalculator.exception.ValidationException;

import java.util.List;

public class StringCalculator {
    private Extractor extractor;
    private Remover remover;
    private Validator validator;

    public StringCalculator(Extractor extractor, Remover remover, Validator validator) {
        this.extractor = extractor;
        this.remover = remover;
        this.validator = validator;
    }

    public int add(String input) throws Exception {
        List<Integer> numbers;

        numbers = extractor.extractNumbers(input);
        numbers = remover.removeIgnoredNumbers(numbers);
        validator.validateNumbers(numbers);

        return sum(numbers);
    }

    private int sum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public interface Validator {
        void validateNumbers(List<Integer> numbers) throws ValidationException;
    }

    public interface Extractor {
        List<Integer> extractNumbers(String input);
    }

    public interface Remover {
        List<Integer> removeIgnoredNumbers(List<Integer> numbers);
    }
}