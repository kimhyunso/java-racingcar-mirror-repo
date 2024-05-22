package racingCar;

public class ValidationCheck {

    public static final int MAX_NO = 5;

    public static boolean isGreaterThan(String name) {
        return name.isEmpty() || name.length() >= MAX_NO;
    }
}
