package commandmode;

public class LightCommand implements Command {
	Light light;
	
	public LightCommand(Light light) {
		this.light=light;
	}
	
	@Override
	public void execute() {
		
	}

	@Override
	public void undo() {
		
	}

}
