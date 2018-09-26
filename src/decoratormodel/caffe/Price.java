package decoratormodel.caffe;

public enum Price {
	
	//基础费
	Espresso(9.9),
	HouseBlend(2.2),
	
	//调料
	Mocha(0.2),
	Millk(0.5);
	
	private  double money;
	
	private Price(double value) {
		this.money=value;
	}

	public double getPrice() {
		return money;
	}
	
}
