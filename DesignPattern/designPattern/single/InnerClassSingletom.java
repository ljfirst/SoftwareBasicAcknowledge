package single;

/**
 *@author liujun
 *@date£º 2018-4-22 Time£ºÉÏÎç12:04:39
 *@author¡ªEmail:ljfirst@mail.ustc.edu.cn
 *@description:
 *@version 1.0
 */
public class InnerClassSingletom implements Singletom {

	private InnerClassSingletom() {
	}
	
	//inner-class
	public static class SinglePatternHub{
		private static final InnerClassSingletom singlePattern =
			new InnerClassSingletom();
	}
	
	public static InnerClassSingletom getsSinglePattern() {
		return SinglePatternHub.singlePattern;
	}
}