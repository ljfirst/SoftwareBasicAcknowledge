package simplefactory;

import test.CT1;

/** 
 *@author liujun
 *@date£º 2019-3-31 ÏÂÎç03:51:33
 *@author¡ªEmail:ljfirst@mail.ustc.edu.cn
 *@description:
 *@URL:
 *@version 1.0
 */
public class SimpleFactory {

	public static CT1 createClass() {

		System.out.print("SimpleFactory:");
		return new CT1();
	}
}


