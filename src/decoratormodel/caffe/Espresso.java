package decoratormodel.caffe;

public class Espresso extends Beverage {
	
	public Espresso() {
		description="ESPRESSO";
	}
	
	@Override
	public double cost() {
		return Price.Espresso.getPrice();//基本费用
	}

}
