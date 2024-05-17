package racingGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidationCheckTest {

    @DisplayName("자동차 이름이 1자이상 5자미만을 확인하는 로직")
    @Test
    void 자동차이름_1자이상_5자미만(){
        assertThat(ValidationCheck.isFiveLessThen("A")).isTrue();
        assertThat(ValidationCheck.isFiveLessThen("gabi")).isTrue();
        assertThat(ValidationCheck.isFiveLessThen("")).isFalse();
        assertThat(ValidationCheck.isFiveLessThen("gabid")).isFalse();
    }
}
