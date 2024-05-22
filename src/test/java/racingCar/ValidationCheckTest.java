package racingCar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidationCheckTest {

    @DisplayName("자동차이름이 1글자 이상 5글자 미만 기능")
    @Test
    void 자동차이름_1이상_5미만(){
        assertThat(ValidationCheck.isGreaterThan("gabie")).isTrue();
        assertThat(ValidationCheck.isGreaterThan("abc")).isFalse();
        assertThat(ValidationCheck.isGreaterThan("")).isTrue();
    }

}
