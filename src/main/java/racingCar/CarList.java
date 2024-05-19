package racingCar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarList {

    private List<Car> cars;

    public CarList(String names) {
        cars = Arrays.stream(names.split(","))
                .map(this::newInstance)
                .collect(Collectors.toList());
    }

    private Car newInstance(String name) {
        return new Car(name);
    }

    public List<Car> getCars() {
        return cars;
    }
}
