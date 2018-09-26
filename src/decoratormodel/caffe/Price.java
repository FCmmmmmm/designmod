package decoratormodel.caffe;

public enum Price {
	
	
	
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
