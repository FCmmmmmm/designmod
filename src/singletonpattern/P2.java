package singletonpattern;

public class P2 {
	private P2(){
		
	}
	
	private volatile static P2 instace=new P2();
	
	public static P2 getInstance() {
		return instace;
	}
	
}
