package com.gdgu.universal;

public class AirConditioner {

    private final int AUTO = 4;
    private final int HIGH = 3;
    private final int MEDIUM = 2;
    private final int LOW = 1;
    private boolean airConditionerOn = false;
    private int cooling;
    private int previousCooling;

    public void on() {
        if (!airConditionerOn) {
            System.out.println("Air Conditioner: On");
            airConditionerOn = true;
            cooling = AUTO;
            previousCooling = AUTO;
        }
    }

    public void off() {
        if (airConditionerOn) {
            System.out.println("Air Conditioner: Off");
            airConditionerOn = false;
        }
    }

    public void setCoolingHigh() {
        System.out.println("Cooling: High");
        previousCooling = cooling;
        cooling = HIGH;
    }

    public void setCoolingMedium() {
        if (airConditionerOn) {
        System.out.println("Cooling: Medium");
        previousCooling = cooling;
        cooling = MEDIUM;
        }
    }

    public void setCoolingLow() {
        if (airConditionerOn) {
        System.out.println("Cooling: Low");
        previousCooling = cooling;
        cooling = LOW;
        }
    }

    public void setCoolingAuto() {
        if (airConditionerOn) {
        System.out.println("Cooling: Auto");
        previousCooling = cooling;
        cooling = AUTO;
        }
    }

    public int getPreviousCooling() {
        return previousCooling;
    }
}
