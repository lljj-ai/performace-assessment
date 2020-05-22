/**
 * @company 中北软院
 */
package nuc.edu.cn.mapper;

import java.security.Principal;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import nuc.edu.cn.util.Staff;

/**
 *
 * @author 洛少雄
 * @date 2020年5月22日
 * @version 1.0
 */
@Mapper
public interface IStaffMapper {
	/**
	  *  查询所属员工信息
	 * @param principal
	 * @return
	 */
	public List<Staff> displayStaffs(Principal principal);
}
