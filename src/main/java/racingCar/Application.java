package racingCar;

import racingCar.domain.GameStatus;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요. 구분기준은 콤마(,)입니다.");
        String names = input.next();
        System.out.println("시도할 횟수는 몇회인가요?");
        int tryCount = input.nextInt();
//        tryCount-- >= 0
//        while (GameStatus.isEnd()){
//
//        }
    }
}
