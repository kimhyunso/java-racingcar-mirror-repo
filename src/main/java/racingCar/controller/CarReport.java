package racingCar.controller;

import racingCar.domain.CarName;
import racingCar.domain.Position;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CarReport {
    public void positionPrint(Map<CarName, Position> map){
        for (CarName key : map.keySet()){
            namePrint(key);
            System.out.println(map.get(key));
        }
        System.out.println();
    }

    public void namePrint(CarName carName){
        String name = carName.toString();
        System.out.print(name + " : ");
    }
}
