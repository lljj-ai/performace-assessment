/**
 * @company 中北软院
 */
package nuc.edu.cn.service;

import java.security.Principal;
import java.util.List;

import org.springframework.stereotype.Service;

import nuc.edu.cn.util.Staff;

/**
  * 负责人
 * @author 洛少雄
 * @date 2020年5月22日
 * @version 1.0
 */
@Service
public interface  IPrincipal_Service {
	/**
	 * 查询所有负责人信息
	 * @param principal
	 * @return
	 */
	public List<Principal> selectAllPrincipals();
	
	/**
	 * 查询所属员工信息
	 * @param principal
	 * @return
	 */
    public List<Staff> selectAllStaff(Principal principal);
    
    /**
     * 插入员工
     * @param id
     * @return
     */
	int insertSatff(Staff satff);
	
	/**
	 * 更新员工信息
	 * @param satff
	 * @return
	 */
	int updateStaff(Staff satff);
	
	/**
	 * 删除员工
	 * @param id
	 * @return
	 */
    int deleteStaff(int id);
}
