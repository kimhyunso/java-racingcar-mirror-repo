package racingGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    @DisplayName("랜덤한 값 발생 후, 4이상이면 전진하는 기능")
    @Test
    void 전진기능(){
        Car car = new Car("qwer", 1);
        int result = car.improve(4);
        assertThat(result).isEqualTo(2);
    }
}
