package doforduck;

public class NoSwim implements SwimInterface {
	@Override
	public void swim() {
		System.out.println("我不会游泳");
	}
}
