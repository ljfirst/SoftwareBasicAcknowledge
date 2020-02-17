package observer;
/** 
 *@author liujun
 *@date： 2018-9-22 下午07:37:22
 *@author—Email:ljfirst@mail.ustc.edu.cn
 *@description:
 *@version 1.0
 */
public class ObserverTest {

	public static void main(String[] args) {
		
		AnimalObservable animal = new AnimalObservable();
		HumanObserver human = new HumanObserver();
		DoctorObserver doc = new DoctorObserver();
		
		//加入观察者
		animal.addObserver(human);
		animal.addObserver(doc);
		
		//更新被观察的查操作
		animal.eat();
	}
}
