package observer;

import java.util.Observable;
import java.util.Observer;

/** 
 *@author liujun
 *@date£º 2018-9-22 ÏÂÎç07:38:07
 *@author¡ªEmail:ljfirst@mail.ustc.edu.cn
 *@description:
 *@version 1.0
 */
public class HumanObserver implements Observer{
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("HumanObserver:" + arg.toString());
	}

	
}
