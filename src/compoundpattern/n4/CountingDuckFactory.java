package compoundpattern.n4;

import compoundpattern.n1.DuckCall;
import compoundpattern.n1.MallardDuck;
import compoundpattern.n1.Quackable;
import compoundpattern.n1.RedheadDuck;
import compoundpattern.n1.RubberDuck;
import compoundpattern.n3.QuackCounter;

public class CountingDuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
  
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
