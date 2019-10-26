package observer;

import java.util.Observable;

/** 
 *@author liujun
 *@date£º 2018-9-22 ÏÂÎç07:39:06
 *@author¡ªEmail:ljfirst@mail.ustc.edu.cn
 *@description:
 *@version 1.0
 */
public class AnimalObservable extends Observable{

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Animal eat");
		
		super.setChanged();
		super.notifyObservers("AnimalObservable eat");
	}
}
