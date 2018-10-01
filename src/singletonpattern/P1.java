package singletonpattern;

public class P1 {
	public int a;
	
	private volatile static P1 instance;
	
	private P1() {
		
	}
	
	public static P1 getInstance() {
		if(instance==null) {
			synchronized (P1.class) {
				if(instance==null) {
					instance=new P1();
				}
			}
		}
		return instance;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
