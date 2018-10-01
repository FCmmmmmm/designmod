package commandmode;

public class SimpleCommand {
	private Command solt;
	public SimpleCommand() {
		
	}
	
	public void setCommand(Command command) {
		this.solt=command;
	}
	
	public void execute() {
		solt.execute();
	}
}
