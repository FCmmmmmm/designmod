package decoratormodel.caffe;

public class HouseBlend	extends Beverage {

	public HouseBlend() {
		description="HOUSEBLEND";
	}
	@Override
	public double cost() {
		return Price.HouseBlend.getPrice();
	}
	
}
