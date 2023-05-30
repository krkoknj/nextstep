package claculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    int sum;

    int add(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (matcher.find()) {
            return customMatcher(matcher);
        }

        return spliter(text);
    }

    private int customMatcher(Matcher matcher) {
        String customDelimeter = matcher.group(1);
        String[] tokens = matcher.group(2).split(customDelimeter);
        for (int i = 0; i < tokens.length; i++) {
            sum += Integer.parseInt(tokens[i]);
        }

        return sum;
    }

    private int spliter(String text) {
        String[] split = text.split(",|:");

        for (int i = 0; i < split.length; i++) {
            sum += Integer.parseInt(split[i]);
        }

        return sum;
    }

}
