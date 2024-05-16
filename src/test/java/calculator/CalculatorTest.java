package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {
    @DisplayName("입력값을 구분자 기준으로 분리하는 작업")
    @ParameterizedTest
    @CsvSource(value = {"1,2:3,4:5/12345"}, delimiter = '/')
    void 구분자_기준_분리(String input, String result){
        Calculator calculator = new Calculator(input);
        assertThat(calculator.removeSeparator()).isEqualTo(result.split(""));
    }

    @DisplayName("입력값이 커스텀인지 판별하는 작업")
    @ParameterizedTest
    @ValueSource(strings = "//;\n1;2;3;4;5")
    void 커스텀_판별_True(String input){
        Calculator calculator = new Calculator(input);
        assertThat(calculator.isCustom()).isTrue();
    }

    @DisplayName("입력값이 커스텀인지 판별하는 작업")
    @ParameterizedTest
    @ValueSource(strings = "1,2:3:4,5")
    void 커스텀_판별_False(String input){
        Calculator calculator = new Calculator(input);
        assertThat(calculator.isCustom()).isFalse();
    }

    @DisplayName("입력값이 커스텀일 경우 커스텀 구분자로 분리하는 작업")
    @Test
    void 커스텀_구분자_분리(){
        String input = "//;\n1;2;3";
        Calculator calculator = new Calculator(input);
        assertThat(calculator.removeCustom()).isEqualTo(new String[]{"1", "2", "3"});
    }

    


}
