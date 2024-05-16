package calculator;

public class Separator {
    public String splitComma(String input) {
        String values[] = input.split(",");
        return addValues(values);
    }

    public String splitColon(String input) {
        String values[] = input.split(":");
        return addValues(values);
    }
    private String addValues(String[] values) {
        return String.join("", values);
    }


    public String removeSeparator(String input) {
        return splitColon(splitComma(input));
    }
}
