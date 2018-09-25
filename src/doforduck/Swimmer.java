package doforduck;

public class Swimmer extends People {

	public Swimmer() {
		swim=new MasterLevelSwim();
	}
	@Override
	void say() {
		System.out.println("我是职业游泳选手");
	}

}
