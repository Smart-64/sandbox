package pattern.behavioral;

import pattern.behavioral.model.strategy.Auto;
import pattern.behavioral.model.strategy.ChargingFill;
import pattern.behavioral.model.strategy.ElectricVehicle;
import pattern.behavioral.model.strategy.FillStrategy;
import pattern.behavioral.model.strategy.StandardFill;
import pattern.behavioral.model.strategy.StandardVehicles;

public class StrategyMain {
    public static void main(String[] args) {
        FillStrategy chargingFill = new ChargingFill();
        Auto electricVehicle = new ElectricVehicle(chargingFill);
        electricVehicle.fill();

        FillStrategy standardFill = new StandardFill();
        Auto standardVehicle = new StandardVehicles(standardFill);
        standardVehicle.fill();

        electricVehicle.setFillStrategy(standardFill);
        electricVehicle.fill();
    }
}
