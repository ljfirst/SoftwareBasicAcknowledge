package observer;

import java.util.Observable;

/** 
 *@author liujun
 *@date�� 2018-9-22 ����07:39:06
 *@author��Email:ljfirst@mail.ustc.edu.cn
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
