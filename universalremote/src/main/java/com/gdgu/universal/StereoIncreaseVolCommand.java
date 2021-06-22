package com.gdgu.universal;

public class StereoIncreaseVolCommand implements Command {

    private Stereo stereo;

    public StereoIncreaseVolCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.increaseVolume();
    }

    @Override
    public void undo() {
        stereo.decreaseVolume();
    }
    
}
