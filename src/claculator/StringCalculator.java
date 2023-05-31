package claculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String text) {
        if (isBlank(text)) {
            return 0;
        }

        String[] split = spliter(text);


        return sum(toInts(split));
    }

    private int toPositive(String text) {
        int number = Integer.parseInt(text);

        if (number < 0) {
            throw new RuntimeException();
        }

        return number;
    }

    private String[] spliter(String text) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (matcher.find()) {
            String customDelimeter = matcher.group(1);
            String[] tokens = matcher.group(2).split(customDelimeter);
            return tokens;
        }

        return text.split(",|:");
    }

    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    private int[] toInts(String[] split) {
        int[] numbers = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            numbers[i] = toPositive(split[i]);
        }

        return numbers;
    }

    private int sum(int[] numbers) {

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

}
