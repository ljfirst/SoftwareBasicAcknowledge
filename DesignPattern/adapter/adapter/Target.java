package adapter;
/** 
 *@author liujun
 *@date�� 2019-1-24 ����06:25:09
 *@author��Email:ljfirst@mail.ustc.edu.cn
 *@description:
 *@URL:
 *@version 1.0
 */
public interface Target {

	public int method3();
	
	public String method4();
}

class Target1 implements Target{

	@Override
	public int method3() {
		// TODO Auto-generated method stub
		System.out.println("Target1 implements Target use method3");
		return 0;
	}

	@Override
	public String method4() {
		// TODO Auto-generated method stub
		System.out.println("Target1 implements Target use method4");
		return null;
	}
	
}