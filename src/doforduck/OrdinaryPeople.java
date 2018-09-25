package doforduck;

public class OrdinaryPeople extends People{

	public OrdinaryPeople() {
		swim=new NoSwim();
	}
	
	@Override
	void say() {
		System.out.println("我是一个平凡的人");
	}
	
}
