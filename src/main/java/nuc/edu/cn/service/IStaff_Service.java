/**
 * @company 中北软院
 */
package nuc.edu.cn.service;

import nuc.edu.cn.util.Staff;

/**
 *
 * @author 洛少雄
 * @date 2020年5月22日
 * @version 1.0
 */
public interface IStaff_Service {
	/**
	  *  查询所属员工信息
	 * @param principal
	 * @return
	 */
	public Staff selectAllStaffs() ;
}
