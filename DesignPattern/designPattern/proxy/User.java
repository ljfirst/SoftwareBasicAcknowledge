package proxy;
/** 
 *@author liujun
 *@date�� 2018-8-17 ����02:15:55
 *@author��Email:ljfirst@mail.ustc.edu.cn
 *@description:�û�������
 *@version 1.0
 */
public class User {

	public static void main(String[] args) {
		
		ProxyInterface r = new Real();
		ProxyInterface p = new Proxy(r);
		p.work();
	}
}
