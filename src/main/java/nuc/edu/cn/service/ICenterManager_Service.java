/*
  * 公司版权 2020
 */
package nuc.edu.cn.service;

import java.util.List;

import nuc.edu.cn.util.CenterManager;
import nuc.edu.cn.util.Principal;
import nuc.edu.cn.util.Staff;

/**
 * 
 * @author 刘杰
 * @version 1.0
 */
public interface ICenterManager_Service {
	/**
	 * 负责人显示
	 * @return
	 */
	public List<Principal> displayPrincipals(CenterManager centerManager);
	public List<Staff> displayStaffs(CenterManager centerManager);
}
