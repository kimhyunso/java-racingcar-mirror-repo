package racingCar.controller;

import racingCar.domain.Car;
import racingCar.domain.Position;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CarList {

    public static final int BOUND = 4;
    private List<Car> cars;
    private Random random;
    public CarList(String names) {
        cars = Arrays.stream(names.split(","))
                .map(this::create)
                .collect(Collectors.toList());

        random = new Random();
    }

    private Car create(String name) {
        return new Car(name);
    }

    public List<Position> move() {
        return cars.stream()
                .map(this::mapPosition)
                .collect(Collectors.toList());
    }

    private Position mapPosition(Car car) {
        int randomNo = random.nextInt(BOUND) + 1;
        return car.move(randomNo);
    }

    public List<Position> move(int randomNo) {
        return cars.stream()
                .map(car -> mapPosition(car, randomNo))
                .collect(Collectors.toList());
    }

    private Position mapPosition(Car car, int randomNo) {
        return car.move(randomNo);
    }

}
