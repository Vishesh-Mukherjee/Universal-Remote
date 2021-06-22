package com.gdgu.universal;

public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

	@Override
	public void undo() {
        System.out.println("Testing");
		light.off();
	}    
}
