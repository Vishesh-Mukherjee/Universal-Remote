package com.gdgu.universal;

public class Stereo {
    
    private int volume = 0;
    private boolean stereoOn = false;

    public void on() {
        if (!stereoOn) {
            System.out.println("Stero: On");
            stereoOn = true;
        }
    }

    public void off() {
        if (stereoOn) {
            System.out.println("Stero: Off");
            stereoOn = false;
        }
    }

    public void increaseVolume() {
        if (volume < 100 && stereoOn) {
            volume ++;
            System.out.println("Current volume: " + volume);
        }
    }

    public void decreaseVolume() {
        if (volume > 0 && stereoOn) {
            volume --;
            System.out.println("Current volume: " + volume);
        }
    }

}
