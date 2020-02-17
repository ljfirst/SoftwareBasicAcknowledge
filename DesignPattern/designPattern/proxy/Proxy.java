package proxy;
/** 
 *@author liujun
 *@date： 2018-8-17 上午02:12:54
 *@author—Email:ljfirst@mail.ustc.edu.cn
 *@description:代理类，其主要实现主体是被代理类的方法。
 *@version 1.0
 */
public class Proxy implements ProxyInterface{

	ProxyInterface p;
	
	public Proxy(ProxyInterface r) {
		// TODO Auto-generated constructor stub
		p = r;
	}
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("i am Proxy, i am help real's work。");
		p.work();
		System.out.println("i am Proxy, work end！");
	}
}
