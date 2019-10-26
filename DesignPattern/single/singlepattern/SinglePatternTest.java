package singlepattern;

/**
 *@author liujun
 *@date£º 2018-4-22 Time£ºÉÏÎç12:04:32
 *@author¡ªEmail:ljfirst@mail.ustc.edu.cn
 *@description:1.SinglePattern
 *             2.HungrySinglePattern
 *             3.LazySinglePattren
 *Attention:Experiments show that the double locks is faster
 *@version 1.0
 */
public class SinglePatternTest {

	public static void main(String[] args) {
		
		long begintime = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			HungrySinglePattern.getHungrySinglePattern();
		}
		System.out.println("HungrySinglePattern spend:"+(System.currentTimeMillis()-begintime));
		//==============================
	    begintime = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			LazySinglePattren.getlLazySinglePattren();
		}
		System.out.println("LazySinglePattren spend:"+(System.currentTimeMillis()-begintime));
		//==============================
	    begintime = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			LazySinglePattren.getlLazySinglePattren1();
		}
		System.out.println("LazySinglePattren1 spend:"+(System.currentTimeMillis()-begintime));
		//==============================
		begintime = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			SinglePattern.getsSinglePattern();
		}
		System.out.println("SinglePattern spend:"+(System.currentTimeMillis()-begintime));
		
		/*new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				long begintime = System.currentTimeMillis();
				for(int i = 0; i < 100000; i++) {
					SinglePattern.getsSinglePattern();
				}
				System.out.println("SinglePattern spend:"+(System.currentTimeMillis()-begintime));
			}
		}).start();*/
		
		/*new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				long begintime = System.currentTimeMillis();
				for(int i = 0; i < 100000; i++) {
					LazySinglePattren.getlLazySinglePattren();
				}
				System.out.println("LazySinglePattren spend:"+(System.currentTimeMillis()-begintime));
			}
		}).start();*/
		
		/*new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				long begintime = System.currentTimeMillis();
				for(int i = 0; i < 100000; i++) {
					HungrySinglePattern.getHungrySinglePattern();
				}
				System.out.println("HungrySinglePattern spend:"+(System.currentTimeMillis()-begintime));
			}
		}).start();*/
	}
}
