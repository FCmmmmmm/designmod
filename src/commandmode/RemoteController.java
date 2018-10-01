package commandmode;

import java.util.Stack;

public class RemoteController {
	Command [] onCommands;
	Command [] offCommands;
	Stack<Command>stack;
	
	public RemoteController() {
		onCommands=new Command[7];
		offCommands=new Command[7];
		Command noCommand=new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i]=noCommand;
			offCommands[i]=noCommand;
		}
		stack=new Stack<>();
	}
	
	public void setCommand(int solt,Command onCommand,Command offCommand) {
		onCommands[solt]=onCommand;
		offCommands[solt]=offCommand;		
	}
	
	public void onButtonClick(int solt) {
		onCommands[solt].execute();
		stack.push(onCommands[solt]);
	}
	
	public void offButtonClick(int solt) {
		offCommands[solt].execute();
		stack.push(offCommands[solt]);
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
	
	public void undoCommandClick() {
		stack.pop().undo();
	}
	
}
