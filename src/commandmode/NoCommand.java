package commandmode;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("没有发生任何事");
	}

	@Override
	public void undo() {
		System.out.println("没有发生任何事");
	}

}
