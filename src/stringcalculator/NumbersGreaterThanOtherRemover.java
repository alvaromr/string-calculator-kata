package stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class NumbersGreaterThanOtherRemover implements StringCalculator.Remover {
    private final int cap;

    public NumbersGreaterThanOtherRemover(int cap) {
        this.cap = cap;
    }

    @Override
    public List<Integer> removeIgnoredNumbers(List<Integer> numbers) {
        List<Integer> numbersNotIgnored = new ArrayList<>();
        numbersNotIgnored.addAll(numbers);
        for (Integer number : numbers) {
            if (number > this.cap) {
                numbersNotIgnored.remove(number);
            }
        }
        return numbersNotIgnored;
    }
}
