/*
  * 公司版权 2020
 */
package nuc.edu.cn.util;

import java.util.Date;

/**
 * 
 * @author 刘杰
 * @version 1.0
 */
public class CenterManager {
	private int id;
	private int idDepart;
	private String name;
	private String sex;
	private String idNumber;
	private Date birthday;
	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdDepart() {
		return idDepart;
	}

	public void setIdDepart(int idDepart) {
		this.idDepart = idDepart;
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

	public CenterManager() {
		super();
	}

}