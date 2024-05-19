package racingCar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    @DisplayName("자동차 전진하는 기능")
    @Test
    void 자동차전진(){
        Car car1 = new Car("gabe");
        assertThat(car1.process(4)).isEqualTo(2);
        Car car2 = new Car("abc");
        assertThat(car2.process(3)).isEqualTo(1);
    }



}
