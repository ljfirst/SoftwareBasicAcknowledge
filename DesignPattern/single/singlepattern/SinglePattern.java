package singlepattern;

/**
 *@author liujun
 *@date£º 2018-4-22 Time£ºÉÏÎç12:04:39
 *@author¡ªEmail:ljfirst@mail.ustc.edu.cn
 *@description:HungrySinglePattern creates an instance object when 
 *the class is loaded, but there is no delay in loading. 
 *In order to solve this problem, LazySinglePattren is introduced, 
 *although the load can be delayed, but the thread is unsafe. 
 *In order to solve the thread security problem,
 *the synchronized keyword is introduced.
 *But there is a performance problem, more time-consuming, 
 *finally , the inner-class is a perfect solution.
 *
 *Attention:Experiments show that the double locks is faster
 *@version 1.0
 */
public class SinglePattern {

	private SinglePattern() {
	}
	
	//inner-class
	public static class SinglePatternHub{
		private static final SinglePattern singlePattern =
			new SinglePattern();
	}
	
	public static SinglePattern getsSinglePattern() {
		return SinglePatternHub.singlePattern;
	}
}

/*
 * HungrySinglePattern means The class object is created when the class 
 * is loaded.The private access level constructor ensures that 
 * singletons are not instantiated in other code in the system.
 */
class HungrySinglePattern{
	
	//The final keyword ensures that objects will not be modified later.
	private static final HungrySinglePattern hungrySinglePattern = 
		new HungrySinglePattern();
	
	private HungrySinglePattern() {
	}
	
	public static HungrySinglePattern getHungrySinglePattern() {
		return hungrySinglePattern;
	}
}

/*
 * LazySinglePattren means delayed loading, but exist thread safety 
 * problem.So use synchronized to solve this problem,
 * but still exist performance problem.
 */
class LazySinglePattren{
	private static LazySinglePattren lazySinglePattren = null;
	
	private LazySinglePattren() {
	}
	
	public static LazySinglePattren getlLazySinglePattren() {
		synchronized (LazySinglePattren.class) {
			if(lazySinglePattren == null){
				lazySinglePattren = new LazySinglePattren();
			}
		}
		
		return lazySinglePattren;
	}
	
	//Experiments show that the double locks is faster
	public static LazySinglePattren getlLazySinglePattren1() {
		if(lazySinglePattren == null){
			synchronized (LazySinglePattren.class) {
				if(lazySinglePattren == null){
					lazySinglePattren = new LazySinglePattren();
				}
			}
		}
		
		return lazySinglePattren;
	}
}

/*enmueration mode can prevent reflection attacks 
without serialization*/

enum EnumSingletom{
	
	instence;
	
	private String singletonname;

	public String getSingletonname() {
		return singletonname;
	}

	public void setSingletonname(String singletonname) {
		this.singletonname = singletonname;
	}
	
	public static void main(String[] args) {
		
		EnumSingletom singletom = EnumSingletom.instence;
		singletom.setSingletonname("first");
		System.out.println(singletom.singletonname);
		
		EnumSingletom singletom2 = EnumSingletom.instence;
		singletom2.setSingletonname("second");
		System.out.println(singletom2.singletonname+" , "+singletom.singletonname);
	
	
		try{
			EnumSingletom[] single = EnumSingletom.class.getEnumConstants();
			for (EnumSingletom i : single) {
				System.out.println(i.getSingletonname());
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}