package com.gdgu.universal;

public class AirConditionerLowCommand implements Command{
    private AirConditioner airConditioner;
    int previousCooling;

    public AirConditionerLowCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.setCoolingLow();
        previousCooling = airConditioner.getPreviousCooling();
    }

    @Override
    public void undo() {
        if (previousCooling == 2) 
            airConditioner.setCoolingMedium();
        else if (previousCooling == 3)
            airConditioner.setCoolingHigh();
        else if (previousCooling == 4)
            airConditioner.setCoolingAuto();
    }
}
