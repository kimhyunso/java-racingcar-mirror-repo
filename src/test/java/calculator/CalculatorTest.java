package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {

    @DisplayName("입력값을 구분자 기준으로 분리하는 작업")
    @Test
    void 구분자를기준으로분리(){
        String input = "1,2:3,4:5";
        Calculator calculator = new Calculator(input);
        String[] result = calculator.removeSeparator();
        assertThat(result).isEqualTo(new String[]{"1", "2", "3", "4", "5"});
    }

    @DisplayName("입력값이 커스텀인지 판별하는 작업")
    @Test
    void 커스텀인지판별_True(){
        String input = "//;\n1;2;3;4;5";
        Calculator calculator = new Calculator(input);
        assertThat(calculator.isCustom()).isTrue();
    }

    @DisplayName("입력값이 커스텀인지 판별하는 작업")
    @Test
    void 커스텀인지판별_False(){
        String input = "1,2:3:4,5";
        Calculator calculator = new Calculator(input);
        assertThat(calculator.isCustom()).isFalse();
    }

}
