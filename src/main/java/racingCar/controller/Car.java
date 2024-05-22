package racingCar.controller;

import racingCar.domain.CarName;

import java.util.Objects;

public class Car {
    private static final int RANDOM_NO = 4;
    private CarName carName;
    private int position;


    public Car(String name) {
        this.position = 1;
        this.carName = new CarName(name);
    }

    public int move(int randomNo) {
        if (randomNo >= RANDOM_NO)
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
