package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.in;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp(){
        String input = "123456";
        calculator = new Calculator(input);
    }

    @DisplayName("구분자를 분리 후 각 숫자의 합을 반환하는 기능")
    @Test
    void 숫자의합을반환하는기능(){
        int result = calculator.sum();
        assertThat(result).isEqualTo(21);
    }


}
