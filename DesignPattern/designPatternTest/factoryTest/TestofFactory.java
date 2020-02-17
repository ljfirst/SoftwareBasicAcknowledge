package factoryTest;

import factory.simplefactory.CT1;
import factory.simplefactory.SimpleFactory;

/** 
 *@author liujun
 *@date£º 2019-3-31 ÏÂÎç03:52:46
 *@author¡ªEmail:ljfirst@mail.ustc.edu.cn
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
