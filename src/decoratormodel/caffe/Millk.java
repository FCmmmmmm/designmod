package decoratormodel.caffe;

public class Millk extends CondimentDecorator {

	Beverage beverage;

	public Millk(Beverage b) {
		this.beverage = b;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+",millk";
	}

	@Override
	public double cost() {
		return Price.Millk.getPrice()+beverage.cost();
	}

}
