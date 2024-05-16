package calculator;

import java.util.regex.Pattern;

public class Calculator {
    public static final String REGEX = ",|:";
    private String input;

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
        return input.split(REGEX);
    }

    public boolean isCustom() {
        return Pattern.matches("//(.)\\n(.*)", input);
    }
}
