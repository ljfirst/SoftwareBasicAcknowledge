package factoryTest;

import factory.simplefactory.CT1;
import factory.simplefactory.SimpleFactory;

/** 
 *@author liujun
 *@date�� 2019-3-31 ����03:52:46
 *@author��Email:ljfirst@mail.ustc.edu.cn
 *@description:
 *@URL:
 *@version 1.0
 */
public class TestofFactory {

	public static void main(String[] args) {
		
		CT1 obj = SimpleFactory.createClass();
		obj.method();
	}
}
