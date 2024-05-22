package racingCar;

public class Car {
    public static final int MAX_NO = 4;
    private final String name;
    private int position;

    public Car(String name) {
        this.position = 1;
        this.name = name;
    }

    public int move(int randomNo) {
        if (randomNo >= MAX_NO)
            return ++position;
        return position;
    }
}
