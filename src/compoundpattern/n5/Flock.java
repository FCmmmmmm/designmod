package compoundpattern.n5;

import java.util.ArrayList;
import java.util.Iterator;

import compoundpattern.n1.Quackable;

public class Flock implements Quackable {
	ArrayList<Quackable> ducks = new ArrayList<Quackable>();
  
	public void add(Quackable duck) {
		ducks.add(duck);
	}
  
	public void quack() {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}
  
	public String toString() {
		return "Flock of Ducks";
	}
}
