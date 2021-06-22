package com.gdgu.universal;

public class AirConditionerMediumCommand implements Command {
    private AirConditioner airConditioner;
    int previousCooling;

    public AirConditionerMediumCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.setCoolingMedium();
        previousCooling = airConditioner.getPreviousCooling();
    }

    @Override
    public void undo() {
        if (previousCooling == 1) 
            airConditioner.setCoolingLow();
        else if (previousCooling == 3)
            airConditioner.setCoolingHigh();
        else if (previousCooling == 4)
            airConditioner.setCoolingAuto();
    }
    
}
