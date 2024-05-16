package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ValidationCheckTest {
    @DisplayName("문자열 계산기 이외의 값 또는 음수를 입력하는 경우 Error 기능")
    @ParameterizedTest
    @ValueSource(strings = "-1,2:3")
    void 문자열_이외의값_또는_음수(String input){
        Assertions.assertThatThrownBy(()->{
            Calculator calculator = new Calculator(input);
            String[] values = calculator.remove();
            int result = calculator.sum(values);
        }).isInstanceOf(RuntimeException.class);
    }


}
