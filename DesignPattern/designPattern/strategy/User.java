package strategy;
/** 
 *@author liujun
 *@date£º 2018-8-22 ÉÏÎç12:11:51
 *@author¡ªEmail:ljfirst@mail.ustc.edu.cn
 *@description:
 *@version 1.0
 */
public class User {

	public static void main(String[] args) {
		Strategy s = new strategy02();
		StrategyMethod sm = new StrategyMethod(s);
		sm.opera();
	}
}
