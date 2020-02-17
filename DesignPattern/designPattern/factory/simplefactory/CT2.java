package factory.simplefactory;

import factory.Factory;

/**
 *@author liujun
 *@date£º 2019-3-31 ÏÂÎç03:59:35
 *@author¡ªEmail:ljfirst@mail.ustc.edu.cn
 *@description:
 *@URL:
 *@version 1.0
 */
public class CT2 implements Factory {

	String s = "i am CT2 implements ClassTest";
	
	@Override
	public void method() {
		System.out.println(s);			
	}

}
