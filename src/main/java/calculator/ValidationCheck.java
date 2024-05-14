package calculator;

import java.util.regex.Pattern;

public class ValidationCheck {


    public static final String REGEX = "[1-9]";

    public static boolean otherValue(String input) {
        if (!Pattern.matches(REGEX, input)){
            throw new RuntimeException("문자열 계산기 이외의 값입니다.");
        }
        return false;
    }
}
