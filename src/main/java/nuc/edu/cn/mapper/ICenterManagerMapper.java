/*
  * 公司版权 2020
 */
package nuc.edu.cn.mapper;

import java.util.List;

import nuc.edu.cn.util.CenterManager;
import nuc.edu.cn.util.Principal;
import nuc.edu.cn.util.Staff;

/**
 * 
 * @author 刘杰
 * @version 1.0
 */
public interface ICenterManagerMapper {
	/**
	 * 同级中心经理查询
	 * 
	 * @return
	 */
	public List<CenterManager> displayManagers();

	/**
	 * 所管理负责人查询
	 * 
	 * @return
	 */
	public List<Principal> displayPrincipals();

	/**
	 * 所管理普通员工查询
	 * 
	 * @return
	 */
	public List<Staff> displayStaffs();
}
