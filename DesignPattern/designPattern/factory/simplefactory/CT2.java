package factory.simplefactory;

import factory.Factory;

/**
 *@author liujun
 *@date�� 2019-3-31 ����03:59:35
 *@author��Email:ljfirst@mail.ustc.edu.cn
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
