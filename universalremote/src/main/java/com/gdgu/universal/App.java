package com.gdgu.universal;

public class App {
    public static void main( String[] args ) {
        
        Remote remote = new Remote();

        Light livingRoomLight = new Light();
        Stereo IndexStereoSystem = new Stereo();
        AirConditioner airConditioner = new AirConditioner();

        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        Command lightOffCommand = new LightOffCommand(livingRoomLight);
        Command stereoOnCommand = new StereoOnCommand(IndexStereoSystem);
        Command stereoOffCommand = new StereoOffCommand(IndexStereoSystem);
        Command stereoIncreaseVolCommand = new StereoIncreaseVolCommand(IndexStereoSystem);
        Command stereoDecreaseVolCommand = new StereoDecreaseVolCommand(IndexStereoSystem);
        Command airConditionOnCommand = new AirConditionerOnCommand(airConditioner);
        Command airConditionerOffCommand = new AirConditionerOffCommand(airConditioner);
        Command airConditionerAutoCommand = new AirConditionerAutoCommand(airConditioner);
        Command airConditionerHighCommand = new AirConditionerHighCommand(airConditioner);
        Command airConditionerMediumCommand = new AirConditionerMediumCommand(airConditioner);
        Command airConditionerLowCommand = new AirConditionerLowCommand(airConditioner);
    
        remote.setCommand(0, lightOnCommand, lightOffCommand);
        remote.setCommand(1, stereoOnCommand, stereoOffCommand);
        remote.setCommand(2, stereoIncreaseVolCommand, stereoDecreaseVolCommand);
        remote.setCommand(3, airConditionOnCommand, airConditionerOffCommand);
        remote.setCommand(4, airConditionerAutoCommand, airConditionerHighCommand);
        remote.setCommand(5, airConditionerMediumCommand, airConditionerLowCommand);
        remote.setPartyMode(new Command[]{lightOnCommand, stereoOnCommand, airConditionerHighCommand});
        
    }
}
