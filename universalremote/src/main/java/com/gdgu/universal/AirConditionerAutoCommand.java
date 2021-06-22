package com.gdgu.universal;

public class AirConditionerAutoCommand implements Command{
    
    private AirConditioner airConditioner;
    int previousCooling;

    public AirConditionerAutoCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.setCoolingAuto();
        previousCooling = airConditioner.getPreviousCooling();
    }

    @Override
    public void undo() {
        if (previousCooling == 1) 
            airConditioner.setCoolingLow();
        else if (previousCooling == 2)
            airConditioner.setCoolingMedium();
        else if (previousCooling == 3)
            airConditioner.setCoolingHigh();
    }
}
