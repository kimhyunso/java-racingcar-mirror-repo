package racingCar;

import java.util.ArrayList;
import java.util.List;

public class CarList {

    private List<Car> cars;
    public CarList(String names) {
        cars = new ArrayList<>();
        for (String name : names.split(",")){
            cars.add(new Car(name));
        }
    }

    public List<Car> getList() {
        return cars;
    }
}
