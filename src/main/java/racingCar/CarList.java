package racingCar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarList {

    private List<Car> cars;

    public CarList(String names) {
        cars = Arrays.stream(names.split(","))
                .map(name -> new Car(name))
                .collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return cars;
    }
}
