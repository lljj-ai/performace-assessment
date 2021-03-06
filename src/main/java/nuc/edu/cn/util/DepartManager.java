/*
  * 公司版权 2020
 */
package nuc.edu.cn.util;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author 刘杰
 * @version 1.0
 */
public class DepartManager {
	private int id;
	private String name;
	private String sex;
	private String idNumber;
	private Date birthday;
	private String phone;
	private String contain;
	private int score;
	private List<CenterManager> centerManager;

	public List<CenterManager> getCenterManager() {
		return centerManager;
	}

	public void setCenterManager(List<CenterManager> centerManager) {
		this.centerManager = centerManager;
	}

	public String getContain() {
		return contain;
	}

	public void setContain(String contain) {
		this.contain = contain;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public DepartManager() {
		super();
	}

}
