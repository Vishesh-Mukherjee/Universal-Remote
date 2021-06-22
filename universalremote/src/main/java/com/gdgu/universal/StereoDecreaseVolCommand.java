package com.gdgu.universal;

public class StereoDecreaseVolCommand implements Command{

    private Stereo stereo;

    public StereoDecreaseVolCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.decreaseVolume();
    }

    @Override
    public void undo() {
        stereo.increaseVolume();
    }
    
}
