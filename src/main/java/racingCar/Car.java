package racingCar;

import java.util.Objects;

public class Car {

    public static final int MAX_NO = 4;
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        position = 1;
    }

    public int process(int randomNumber) {
        if (isMoreThanFour(randomNumber))
            ++position;
        return position;
    }

    private boolean isMoreThanFour(int randomNumber) {
        return randomNumber >= MAX_NO;
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
