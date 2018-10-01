package commandmode;

public class Test {
	public static void main(String[] args) {
		Light light=new Light();
		LightOnCommand command=new LightOnCommand(light);
		SimpleCommand simpleCommand=new SimpleCommand();
		
		simpleCommand.setCommand(command);
		simpleCommand.execute();
		
		
		GarageDoorOpenCommand command2=new GarageDoorOpenCommand(new GarageDoor());
		simpleCommand.setCommand(command2);
		simpleCommand.execute();
		
	}
}
