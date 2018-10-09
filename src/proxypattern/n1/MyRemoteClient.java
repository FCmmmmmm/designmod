package proxypattern.n1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class MyRemoteClient {
	
	public void go() {
		try {
			Remote remote = Naming.lookup("rmi://127.0.0.1:1099/Hello");
			MyRemote imp=(MyRemote)remote;
			String string=imp.sayHello();
			System.out.println(string);
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
}
