package compoundpattern.n3;

import compoundpattern.n1.Quackable;

public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;//叫的次数
	static int numberDucks;//鸭子次数
  
	public QuackCounter (Quackable duck) {
		this.duck = duck;
		numberDucks++;
	}
  
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 
	public static int getQuacks() {
		return numberOfQuacks;
	}
	public String toString() {
		return duck.toString();
	}
	
	public static int getNumberDucks() {
		return numberDucks;
	}
}
