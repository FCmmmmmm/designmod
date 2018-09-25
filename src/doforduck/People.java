package doforduck;

public abstract class People {

	SwimInterface swim;// 不是每个人都会游泳 单独成接口利用多态-继承思想更好

	void swim() {
		swim.swim();// swim变成了功能 就算每次必须注入swimInterface 但是由于其子类问题便可实现空白的游泳技能与熟练地游泳技能
	}


	void life() {// 每个人都拥有 固有通用的东西
		System.out.println("每个人都有生存的权力");
	}
	
	abstract void say();// 每个人都能说-> 具体怎么说由子类说{忽略特殊情况}
	
	public void setSwim(SwimInterface swimInterface) {//达到动态修改的目的
		this.swim=swimInterface;
	}
}
