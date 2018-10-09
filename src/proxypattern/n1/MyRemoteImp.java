package proxypattern.n1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImp extends UnicastRemoteObject implements MyRemote{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1158724656387727873L;

	public MyRemoteImp()throws RemoteException {
	}
	
	@Override
	public String sayHello() throws RemoteException {
		return "欢迎来到我的世界";
	}

	public static void main(String[] args) {
		try {
			
			LocateRegistry.createRegistry(1099);

			MyRemoteImp service=new MyRemoteImp();
			Naming.rebind("Hello", service);
			System.out.println("启动成功！！！！！！！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
