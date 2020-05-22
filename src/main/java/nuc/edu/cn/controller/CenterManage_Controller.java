/*
  * 公司版权 2020
 */
package nuc.edu.cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import nuc.edu.cn.service.ICenterManager_Service;

/**
 * 
 * @author 刘杰
 * @version 1.0
 */
@Controller
@RequestMapping("/centerManager")
public class CenterManage_Controller {
	@Autowired
	ICenterManager_Service iCenterManager_Service;
}
