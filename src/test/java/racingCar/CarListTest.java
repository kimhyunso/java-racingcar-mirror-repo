package racingCar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingCar.controller.CarList;
import racingCar.domain.CarName;
import racingCar.domain.Position;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarListTest {

    private CarList cars;

    @BeforeEach
    void setUp(){
        cars = new CarList( "gabi,abc,qwer");
    }

    @DisplayName("자동차 이름을 쉼표로 구분")
    @Test
    void 자동차_쉼표로구분(){
        Assertions.assertThatThrownBy(()->{
            CarName carName1 = new CarName("");
            CarName carName2 = new CarName("12345");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("랜덤값이 4이상인 차량들 움직이기")
    @Test
    void move(){
        assertThat(cars.move(4)).isEqualTo(Arrays.asList(new Position(2), new Position(2), new Position(2)));
    }

    @DisplayName("랜덤값이 4미만인 차량들 멈추기")
    @Test
    void stop(){
        assertThat(cars.move(3)).isEqualTo(Arrays.asList(new Position(1), new Position(1), new Position(1)));
    }
}
