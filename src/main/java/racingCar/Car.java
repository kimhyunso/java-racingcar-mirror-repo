package racingCar;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
