package compoundpattern.n4;

import compoundpattern.n1.Quackable;
import compoundpattern.n2.Goose;
import compoundpattern.n2.GooseAdapter;
import compoundpattern.n3.QuackCounter;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
 
		simulator.simulate(duckFactory);
	}
 
	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		duckFactory.createDuckCall();
		Quackable gooseDuck = new GooseAdapter(new Goose());
 
		System.out.println("\nDuck Simulator: With Abstract Factory");
 
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		
		System.out.println(QuackCounter.getNumberDucks());
		
		System.out.println("The ducks quacked " + 
		                   QuackCounter.getQuacks() + 
		                   " times");
	}
 
	void simulate(Quackable duck) {
		duck.quack();
	}
}
