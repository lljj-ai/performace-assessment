/**
 * @company 中北软院
 */
package nuc.edu.cn.serviceImp;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import nuc.edu.cn.mapper.IPrincipalMapper;
import nuc.edu.cn.mapper.IStaffMapper;
import nuc.edu.cn.service.IPrincipal_Service;
import nuc.edu.cn.util.Staff;

/**
 *
 * @author 洛少雄
 * @date 2020年5月22日
 * @version 1.0
 */
public class Principal_ServiceImpl implements IPrincipal_Service {

	@Autowired
	IPrincipalMapper principalmapper;
	
	@Override
	public List<Principal> selectAllPrincipals() {
		return principalmapper.selectAllPrincipals();
	}

	@Override
	public List<Staff> selectAllStaff(Principal principal) {
		return principalmapper.selectAllStaff(principal);
	}
	
	@Override
	public int insertSatff(Staff satff) {
		return principalmapper.insertStaff(satff);
	}

	@Override
	public int updateStaff(Staff satff) {
		return principalmapper.updateStaff(satff);
	}

	@Override
	public int deleteStaff(int id) {
		return principalmapper.deleteStaff(id);
	}
	
}
