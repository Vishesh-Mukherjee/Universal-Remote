package com.gdgu.universal;

public class AirConditionerHighCommand implements  Command{
    private AirConditioner airConditioner;
    int previousCooling;

    public AirConditionerHighCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.setCoolingHigh();
        previousCooling = airConditioner.getPreviousCooling();
    }

    @Override
    public void undo() {
        if (previousCooling == 1) 
            airConditioner.setCoolingLow();
        else if (previousCooling == 2)
            airConditioner.setCoolingMedium();
        else if (previousCooling == 4)
            airConditioner.setCoolingAuto();
    }
}
