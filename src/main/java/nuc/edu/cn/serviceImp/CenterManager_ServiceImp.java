/*
  * 公司版权 2020
 */
package nuc.edu.cn.serviceImp;

import java.util.List;

import nuc.edu.cn.service.ICenterManager_Service;
import nuc.edu.cn.util.CenterManager;
import nuc.edu.cn.util.Principal;
import nuc.edu.cn.util.Staff;

/**
 * 
 * @author 刘杰
 * @version 1.0
 */
public class CenterManager_ServiceImp implements ICenterManager_Service {
	/**
	 * 同级中心经理查询
	 * 
	 * @return
	 */
	@Override
	public List<CenterManager> displayManagers() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 所管理负责人查询
	 * 
	 * @return
	 */
	@Override
	public List<Principal> displayPrincipals() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 所管理普通员工查询
	 * 
	 * @return
	 */
	@Override
	public List<Staff> displayStaffs() {
		// TODO Auto-generated method stub
		return null;
	}

}
