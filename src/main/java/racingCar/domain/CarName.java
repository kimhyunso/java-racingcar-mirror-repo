package racingCar.domain;

public class CarName {

    private static final int MAX_NO = 5;

    public CarName(String name) {
        if (isBlank(name)){
            throw new IllegalArgumentException("이름의 길이가 1미만 5초과입니다.");
        }
    }

    public boolean isBlank(String name) {
        return name.isEmpty() || name.length() >= MAX_NO;
    }
}
