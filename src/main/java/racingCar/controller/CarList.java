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
        List<Position> result = new ArrayList<>();
        int randomNo = random.nextInt(BOUND) + 1;

        for (Car car : cars){
            result.add(car.move(randomNo));
        }
        return result;
    }

    public List<Position> move(int randomNo) {
        List<Position> result = new ArrayList<>();

        for (Car car : cars){
           result.add(car.move(randomNo));
        }
        return result;
    }

}
