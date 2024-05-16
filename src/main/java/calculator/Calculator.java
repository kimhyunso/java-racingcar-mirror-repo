package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static final String REGEX_COMMA_COLON = ",|:";
    public static final String REGEX_CUSTOM = "//(.)\\n(.*)";
    private String input;

    public Calculator(){}

    public Calculator(String input) {
        this.input = input;
        if (isNullOrEmpty()){
            this.input = "0";
        }
    }

    private boolean isNullOrEmpty() {
        return input == null || input.isEmpty();
    }

    public String[] removeSeparator() {
        return input.split(REGEX_COMMA_COLON);
    }

    public boolean isCustom() {
        return Pattern.matches(REGEX_CUSTOM, input);
    }

    public String[] removeCustom() {
        Matcher matcher = Pattern.compile(REGEX_CUSTOM).matcher(input);
        if (matcher.find()){
            String customDelimiter = matcher.group(1);
            return matcher.group(2).split(customDelimiter);
        }
        return removeSeparator();
    }
}
