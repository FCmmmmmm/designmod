package decoratormodel.caffe;

public enum Cup {
	big(2),
	mid(1),
	small(0.5);
	
    double money;
	
	private Cup(double value) {
		this.money=value;
	}
	
	public double getMoney() {
		return money;
	}
	
}
