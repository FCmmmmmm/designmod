package decoratormodel.caffe;

public class Espresso extends Beverage {
	
	public Espresso() {
		description="ESPRESSO";
	}
	
	@Override
	public double cost() {
		return 9.9;//基本费用
	}

}
