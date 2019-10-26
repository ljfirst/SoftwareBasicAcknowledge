package proxy;
/** 
 *@author liujun
 *@date： 2018-7-28 下午08:47:26
 *@author—Email:ljfirst@mail.ustc.edu.cn
 *@description:代理模式的主体：real
 *@version 1.0
 */
public class Real implements ProxyInterface{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("i am real, i am doing work");
	}
}
