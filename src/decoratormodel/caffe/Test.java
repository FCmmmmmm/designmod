package decoratormodel.caffe;

public class Test {
	public static void main(String[] args) {
		Espresso espresso=new Espresso();
		Mocha mocha=new Mocha(espresso);
		Millk millk=new Millk(mocha);
		System.out.println(millk.getDescription());
		System.out.println(millk.cost());
	}
}
