package racingCar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingCar.controller.Car;
import racingCar.controller.CarList;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarListTest {

    @DisplayName("자동차 이름을 쉼표로 구분")
    @Test
    void 자동차_쉼표로구분(){
        CarList cars = new CarList("gabi,abc,qwer");
        assertThat(cars.getList()).isEqualTo(Arrays.asList(new Car("gabi"), new Car("abc"), new Car("qwer")));
    }

    @DisplayName("랜덤값이 4이상인 차량들 움직이기")
    @Test
    void move(){
        CarList carList = new CarList("gabi,abc,qwer");
        assertThat(carList.move(4)).isEqualTo(Arrays.asList(2, 2, 2));
    }

    @DisplayName("랜덤값이 4미만인 차량들 멈추기")
    @Test
    void stop(){
        CarList carList = new CarList("gabi,abc,qwer");
        assertThat(carList.move(3)).isEqualTo(Arrays.asList(1, 1, 1));
    }


}
