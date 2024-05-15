package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class ValidationCheckTest {

    @DisplayName("문자열 계산기 이외의 값 : RuntimeException throw")
    @Test
    void 문자열계산기이외의값(){

        assertThat(ValidationCheck.otherValue("1")).isTrue();
        assertThat(ValidationCheck.otherValue("9")).isTrue();
        assertThatThrownBy(() -> ValidationCheck.otherValue("가"))
                .isInstanceOf(RuntimeException.class);
        assertThatThrownBy(() -> ValidationCheck.otherValue("-1"))
                .isInstanceOf(RuntimeException.class);
    }
}
