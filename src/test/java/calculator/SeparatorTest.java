package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.in;

public class SeparatorTest {

    private Separator separator;

    @BeforeEach
    void setUp(){
        separator = new Separator();
    }

    @DisplayName("입력값을 쉼표를 기준으로 분리하기")
    @ParameterizedTest
    @ValueSource(strings = "1,2,3,4,5,6")
    void 쉼표를기준으로분리(String input){
        assertThat(separator.splitComma(input)).isEqualTo("123456");
    }

    @DisplayName("입력값을 콜론을 기준으로 분리하기")
    @ParameterizedTest
    @ValueSource(strings = "1:2:3:4:5:6")
    void 콜론을기준으로분리(String input){
        assertThat(separator.splitColon(input)).isEqualTo("123456");
    }


    @DisplayName("입력값을 쉼표와콜론을 기준으로 분리하기")
    @ParameterizedTest
    @ValueSource(strings = "1,2:3:4,5:6")
    void 쉼표및콜론을기준으로분리(String input){
        assertThat(separator.removeSeparator(input)).isEqualTo("123456");
    }

//    @DisplayName("입력값 중 커스텀을 기준으로 분리하기")
//    @ParameterizedTest
//    @ValueSource(strings = "//;\n1;2;3;4;5;6")
//    void 커스텀을기준으로분리하기(String input){
//        assertThat(separator.splitCustom(input)).isEqualTo("123456");
//    }
}
