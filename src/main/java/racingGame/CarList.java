package racingGame;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarList {
    private final String[] names;

    public CarList(String names) {
        this.names = names.split(",");
    }

    public List<Car> toArray() {
        return Arrays.stream(names)
                .map(this::carInit)
                .collect(Collectors.toList());
    }

    private Car carInit(String value) {
        return new Car(value, 1);
    }

}
