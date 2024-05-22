package racingCar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarListTest {

    @DisplayName("자동차 이름을 쉼표로 구분")
    @Test
    void 자동차_쉼표로구분(){
        String names = "gabi,abc,qwer";
        CarList cars = new CarList(names);
        assertThat(cars.getList()).isEqualTo(Arrays.asList(new Car("gabi"), new Car("abc"), new Car("qwer")));
    }

}
