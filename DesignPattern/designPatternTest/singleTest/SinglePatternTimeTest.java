package singleTest;

import single.*;

/**
 * @author liujun
 * @version 1.0
 * @date�� 2018-4-22 Time������12:04:32
 * @author��Email:ljfirst@mail.ustc.edu.cn
 * @description:1.SinglePattern 2.HungrySinglePattern
 * 3.LazySinglePattren
 * Attention:Experiments show that the double locks is faster
 */
public class SinglePatternTimeTest {

    public static void main(String[] args) {

        long begintime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            HungrySingle.getHungrySinglePattern();
        }
        System.out.println("1 HungrySinglePattern spend:" + (System.currentTimeMillis() - begintime));
        //==============================
        begintime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            LazySingle.getlLazySinglePattren();
        }
        System.out.println("2 LazySinglePattren spend:" + (System.currentTimeMillis() - begintime));
        //==============================
        begintime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            DCLSingletom.getdclSingletom();
        }
        System.out.println("3 DCLSingletom spend:" + (System.currentTimeMillis() - begintime));
        //==============================
        begintime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            InnerClassSingletom.getsSinglePattern();
        }
        System.out.println("4 InnerClassSingletom spend:" + (System.currentTimeMillis() - begintime));
        //==============================
        begintime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            EnumSingletom d = EnumSingletom.EnumSingletom;
        }
        System.out.println("5 EnumSingletom spend:" + (System.currentTimeMillis() - begintime));

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
