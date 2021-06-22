package com.gdgu.universal;

public class CeilingFan {
    private final int HIGH = 3;
    private final int MEDIUM = 2;
    private final int LOW = 1;
    private int speed = 0;

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public int getSpeed() {
        return speed;
    }
}
