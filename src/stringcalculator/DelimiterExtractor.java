package stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class DelimiterExtractor implements StringCalculator.Extractor {

    private final String delimiter;

    public DelimiterExtractor(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public List<Integer> extractNumbers(String input) {
        List<Integer> elements = new ArrayList<>();
        if (input.equals("")) {
            return elements;
        }

        for (String element : input.split(this.delimiter)) {
            elements.add(Integer.parseInt(element));
        }
        return elements;
    }
}
