package SystemDesign.DesignPattern.WithStrategyPattern;

import SystemDesign.DesignPattern.WithStrategyPattern.Strategy.DriveStrategy;
import SystemDesign.DesignPattern.WithStrategyPattern.Strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
