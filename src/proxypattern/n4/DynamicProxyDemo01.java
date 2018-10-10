package proxypattern.n4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyDemo01 {
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject(); // 1.创建委托对象
		ProxyHalder handler = new ProxyHalder(realSubject); // 2.创建调用处理器对象
		Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
				RealSubject.class.getInterfaces(), handler); // 3.动态生成代理对象
		// 4.通过代理对象调用方法
		proxySubject.request();
	}
}

/**
 * 接口
 */
interface Subject {
	void request();
}

/**
 * 委托类
 */
class RealSubject implements Subject {
	public void request() {
		System.out.println("====RealSubject Request====");
	}
}

class ProxyHalder implements InvocationHandler {

	Subject subject;

	public ProxyHalder(Subject subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().startsWith("re")) {
			System.out.println("start with re* method");
		}
		System.out.println("====before====");// 定义预处理的工作，当然你也可以根据 method 的不同进行不同的预处理工作
		Object result = method.invoke(subject, args);
		System.out.println("====after====");

		return result;
	}

}