package calculator;

import java.util.Arrays;

public class Calculator {
    private final String input;

    public Calculator(String input) {
        this.input = input;
    }


    public int sum() {
        return Arrays.stream(input.split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
