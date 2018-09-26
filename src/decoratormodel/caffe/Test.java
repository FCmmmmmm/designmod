package decoratormodel.caffe;

public class Test {
	public static void main(String[] args) {
		Espresso espresso=new Espresso();
		Mocha mocha=new Mocha(espresso);
		Millk millk=new Millk(mocha);
		CupSIze cupSIze=new CupSIze(millk, Cup.big);
		System.out.println(cupSIze.getDescription());
		System.out.println(cupSIze.cost());
	}
}
