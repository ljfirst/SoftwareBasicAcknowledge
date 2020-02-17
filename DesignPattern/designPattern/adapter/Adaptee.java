package adapter;
/** 
 *@author liujun
 *@date： 2019-1-24 下午06:25:27
 *@author—Email:ljfirst@mail.ustc.edu.cn
 *@description:将Target的method3、4适配为Adaptee的method1、2
 *@URL:
 *@version 1.0
 */
public interface Adaptee {

	public int method1();
	
	public String method2();
}

class Adaptee1 implements Adaptee{

	@Override
	public int method1() {
		// TODO Auto-generated method stub
		System.out.println("Adapter1 implements Adaptee use method1");
		return 0;
	}

	@Override
	public String method2() {
		// TODO Auto-generated method stub
		System.out.println("Adapter1 implements Adaptee use method2");
		return null;
	}
	
}