package visitor;
/** 
 *@author liujun
 *@date： 2019-1-6 下午04:32:39
 *@author—Email:ljfirst@mail.ustc.edu.cn
 *@description:
 *@URL:
 *@version 1.0
 */
public interface Visitor {

	//服务员的访问方法
	void visit(PositionWaiter pw);
	//经理的访问方法
	void visit(PositionManager pm);
	//工人的访问方法
	void visit(PositionWorker pworker);
}

class ServiceProvider implements Visitor{

	@Override
	public void visit(PositionWaiter pw) {
		// TODO Auto-generated method stub
		System.out.println("i am PositionWaiter");
		System.out.println(pw.PName);
	}

	@Override
	public void visit(PositionManager pm) {
		// TODO Auto-generated method stub
		System.out.println("i am PositionManager");
		System.out.println(pm.stock);
	}

	@Override
	public void visit(PositionWorker pworker) {
		// TODO Auto-generated method stub
		System.out.println("i am PositionWorker");
		System.out.println(pworker.subsidy);
	}
}
