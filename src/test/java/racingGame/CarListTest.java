package racingGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarListTest {

    @DisplayName("차량 이름 쉼표로 구분")
    @Test
    void 차량이름_쉼표구분(){
        CarList carList = new CarList("gabi,tobe,goo");
        List<Car> result = carList.toArray();

        assertThat(result.contains(new Car("gabi", 1))).isTrue();
        assertThat(result.contains(new Car("tobe", 1))).isTrue();
        assertThat(result.contains(new Car("goo", 1))).isTrue();
    }


}
