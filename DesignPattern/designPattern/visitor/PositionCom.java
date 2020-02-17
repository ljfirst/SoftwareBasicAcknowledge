package visitor;
/** 
 *@author liujun
 *@date： 2019-1-6 下午04:33:14
 *@author—Email:ljfirst@mail.ustc.edu.cn
 *@description:
 *@URL:
 *@version 1.0
 */

//公司职位的数据结构
public class PositionCom {
	String PName;
	int Salary;
	public PositionCom(String PName, int Salary) {
		// TODO Auto-generated constructor stub
		this.PName = PName;
		this.Salary = Salary;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
}

//接受者
interface Accept{

	void acceptable(Visitor v);
}
//服务员的数据结构
class PositionWaiter extends PositionCom implements Accept{

	public PositionWaiter(String PName, int Salary) {
		super(PName, Salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acceptable(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
}

//经理的数据结构
class PositionManager extends PositionCom implements Accept{

	int stock;
	public PositionManager(String PName, int Salary, int stock) {
		super(PName, Salary);
		this.stock = stock;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public void acceptable(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
}

//工人的数据结构
class PositionWorker extends PositionCom implements Accept{

	double subsidy;
	public PositionWorker(String PName, int Salary, double subsidy) {
		super(PName, Salary);
		this.subsidy = subsidy;
	}
	public double getSubsidy() {
		return subsidy;
	}
	public void setSubsidy(double subsidy) {
		this.subsidy = subsidy;
	}
	@Override
	public void acceptable(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
}