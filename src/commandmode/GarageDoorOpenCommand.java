package commandmode;

public class GarageDoorOpenCommand implements Command{
	
	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		// TODO Auto-generated constructor stub
		this.garageDoor=garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.up();
	}

	@Override
	public void undo() {
		garageDoor.down();
	}
}
