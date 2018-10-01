package commandmode;

public class TestRemote {
	public static void main(String[] args) {
		RemoteController controller=new RemoteController();
		Light light=new Light();
		LightOnCommand onCommand=new LightOnCommand(light);
		LightOffCommand offCommand=new LightOffCommand(light);
		controller.setCommand(0, onCommand, offCommand);
		
		System.out.println(controller);
		controller.onButtonClick(0);
		controller.offButtonClick(0);
		controller.undoCommandClick();
		controller.undoCommandClick();
	}
}
