package SystemDesign.DesignPattern.WithStrategyPattern;

import SystemDesign.DesignPattern.WithStrategyPattern.Strategy.DriveStrategy;
import SystemDesign.DesignPattern.WithStrategyPattern.Strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle() {
        super(new SportDriveStrategy());
    }
}
