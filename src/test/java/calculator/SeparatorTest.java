package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SeparatorTest {

    @DisplayName("입력값을 쉼표를 기준으로 분리하기")
    @Test
    void 쉼표를기준으로분리(){
        String input = "1,2,3,4,6";
        assertThat(Separator.splitComma(input)).isEqualTo("12346");
    }

    @DisplayName("입력값을 콜론을 기준으로 분리하기")
    @Test
    void 콜론을기준으로분리(){
        String input = "1:2:3:4:6";
        assertThat(Separator.splitColon(input)).isEqualTo("12346");
    }

}
