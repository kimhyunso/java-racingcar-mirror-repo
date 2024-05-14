package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {

    @DisplayName("문자열 계산기 이외의 값 : RuntimeException throw")
    @Test
    void 문자열계산기이외의값(){
        String input = "-1";
        boolean result = ValidationCheck.otherValue(input);
        assertThat(result).isTrue();
    }
}
