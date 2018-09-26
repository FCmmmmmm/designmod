package decoratormodel.caffe;

public class Mocha extends CondimentDecorator {

	Beverage beverage;

	public Mocha(Beverage b) {
		this.beverage = b;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+",mocha";
	}

	@Override
	public double cost() {
		return Price.Mocha.getPrice()+beverage.cost();
	}

}
