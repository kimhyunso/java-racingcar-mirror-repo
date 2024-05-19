package racingCar;

import java.util.Objects;

public class Car {

    public static final int MAX_NO = 4;
    private final CarName carName;
    private int position;

    public Car(String name) {
        this.carName = new CarName(name);
        position = 1;
    }

    public int process(int randomNumber) {
        if (isMoreThanFour(randomNumber)){
            return ++position;
        }
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
        return position == car.position && Objects.equals(carName.getName(), car.carName.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, position);
    }
}
