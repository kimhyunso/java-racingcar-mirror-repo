package racingCar.controller;

import racingCar.domain.Position;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CarList {

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

    public List<Integer> move() {
        List<Integer> result = new ArrayList<>();
        int randomNo = random.nextInt(4) + 1;

        for (Car car : cars){
            car.move(randomNo);
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
