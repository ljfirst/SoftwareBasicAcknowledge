package strategy;
/** 
 *@author liujun
 *@date�� 2018-8-22 ����12:10:06
 *@author��Email:ljfirst@mail.ustc.edu.cn
 *@description:
 *@version 1.0
 */
public class StrategyMethod {

	Strategy strategy;
	
	public StrategyMethod(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void opera() {
		strategy.method();
	}
}
