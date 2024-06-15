package SystemDesign.DesignPattern.WithStrategyPattern;

import SystemDesign.DesignPattern.WithStrategyPattern.Strategy.DriveStrategy;
import SystemDesign.DesignPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodVehicle extends Vehicle{

    GoodVehicle() {
        super(new NormalDriveStrategy());
    }
}
