package racingGame;

public class ValidationCheck {

    public static final int MIN_NO = 0;
    public static final int MAX_NO = 5;

    public static boolean isFiveLessThen(String name) {
        final int length = name.length();
        return length > MIN_NO && length < MAX_NO;
    }

}
