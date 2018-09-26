package decoratormodel.caffe;

public class CupSIze extends CondimentDecorator {

	Beverage beverage;
	private Cup size;
	
	public CupSIze(Beverage b,Cup size) {
		this.beverage=b;
		this.size=size;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+",CupSize:"+(size.name());
	}

	@Override
	public double cost() {
		return size.getMoney()+beverage.cost();
	}

}
