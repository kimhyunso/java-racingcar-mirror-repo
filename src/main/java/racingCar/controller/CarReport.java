package racingCar.controller;

import racingCar.domain.CarName;
import racingCar.domain.Position;

public class CarReport {
    public void positionPrint(Position position){
        String count = position.toString();
        System.out.println(count);
    }

    public void namePrint(CarName carName){
        String name = carName.toString();
        System.out.print(name + " : ");
    }
}
