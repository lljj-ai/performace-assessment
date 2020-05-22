/**
 * @company 中北软院
 */
package nuc.edu.cn.service;

import java.security.Principal;
import java.util.List;

import nuc.edu.cn.util.Staff;

/**
  * 负责人
 * @author 洛少雄
 * @date 2020年5月22日
 * @version 1.0
 */
public interface  IPrincipal_Service {
	/**
	  * 查询所有负责人信息
	 * @param principal
	 * @return
	 */
	public List<Principal> displayPrincipals(Principal principal);
	/**
	  *  查询所属员工信息
	 * @param principal
	 * @return
	 */
    public List<Staff> displayStaffs(Principal principal);
    
}
