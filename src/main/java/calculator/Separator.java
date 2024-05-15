package calculator;

import java.util.Arrays;

public class Separator {
    public static String splitComma(String input) {
        String values[] = input.split(",");
        return addValues(values);
    }

    public static String splitColon(String input) {
        String values[] = input.split(":");
        return addValues(values);
    }

    private static String addValues(String[] values) {
        String result = "";
        for (String value : values){
            result += value;
        }
        return result;
    }
}
