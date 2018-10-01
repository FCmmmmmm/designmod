package commandmode;

public class LightOnCommand extends LightCommand {
	public LightOnCommand(Light light) {
		super(light);
	}
	
	@Override
	public void execute() {
		light.on();
	}
	
	@Override
	public void undo() {
		light.off();
	}
}
