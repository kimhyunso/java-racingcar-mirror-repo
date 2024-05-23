package racingCar.domain;

public enum GameStatus {
    START, END;


    public boolean isEnd() {
        return this == END;
    }


    public boolean isStart() {
        return this == START;
    }
}
