package com.gdgu.universal;

public class Light {
    
    private boolean lightOn = false;

    public void on() {
        if (!lightOn) {
            System.out.println("Light: On");
            lightOn = true;
        }
    }

    public void off() {
        if (lightOn) {
            System.out.println("Light: Off");
            lightOn = false;
        }
    }
}
