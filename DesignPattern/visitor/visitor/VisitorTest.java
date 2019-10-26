package visitor;

import java.util.ArrayList;
import java.util.List;

/** 
 *@author liujun
 *@date： 2019-1-6 下午04:32:16
 *@author—Email:ljfirst@mail.ustc.edu.cn
 *@description:
 *@URL:
 *@version 1.0
 */
public class VisitorTest {

	public static void main(String[] args) {
		List<Accept> Plist = new ArrayList<Accept>();
		
		Plist.add(new PositionWaiter("小张服务员", 2000));
		Plist.add(new PositionManager("王经理", 10000, 20));
		Plist.add(new PositionWorker("李工", 5000, 30.56));
		
		ServiceProvider sp = new ServiceProvider();
		for (Accept p : Plist) {
			p.acceptable(sp);
		}
	}
}
