package racingCar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    @DisplayName("자동차 전진하는 기능")
    @Test
    void 자동차전진(){
        Car car = new Car("gabe");
        int randomNumber = 4;
        assertThat(car.process(randomNumber)).isEqualTo(2);
    }



}
