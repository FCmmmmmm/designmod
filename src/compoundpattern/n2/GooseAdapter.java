package compoundpattern.n2;

import compoundpattern.n1.Quackable;


//通过适配器模式把 鹅 转换成了实现 Quackable 的鸭子
public class GooseAdapter implements Quackable {

	private Goose goose;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.honk();
	}

}
