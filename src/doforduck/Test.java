package doforduck;

public class Test {
	//代码耦合程度降低
	public static void main(String[] args) {
		People people=new OrdinaryPeople();
		people.swim();
		people.say();
		System.out.println("——————————————————————我认真学习了游泳之后——————————————————————————");
		
		people.setSwim(new MasterLevelSwim());
		people.swim();
	}
}
