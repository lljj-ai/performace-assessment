/**
 * @company 中北软院
 */
package nuc.edu.cn.serviceImp;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nuc.edu.cn.mapper.DepartmentMapper;
import nuc.edu.cn.mapper.IStaffMapper;
import nuc.edu.cn.service.IStaff_Service;
import nuc.edu.cn.util.Staff;

/**
 *
 * @author 洛少雄
 * @date 2020年5月22日
 * @version 1.0
 */
@Service
public class Staff_ServiceImpl implements IStaff_Service {

	@Autowired
	IStaffMapper staffmapper;
	
	@Override
	public Staff selectAllStaffs() {
		return staffmapper.selectAllStaffs();
	}
 
}
