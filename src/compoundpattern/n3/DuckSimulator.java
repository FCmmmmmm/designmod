package compoundpattern.n3;

import compoundpattern.n1.DuckCall;
import compoundpattern.n1.MallardDuck;
import compoundpattern.n1.Quackable;
import compoundpattern.n1.RedheadDuck;
import compoundpattern.n1.RubberDuck;
import compoundpattern.n2.Goose;
import compoundpattern.n2.GooseAdapter;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Decorator");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		simulate(rubberDuck);
		
		System.out.println("Number of ducks is "+QuackCounter.getNumberDucks());
		System.out.println("The ducks quacked " + 
		                   QuackCounter.getQuacks() + " times");
		
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
