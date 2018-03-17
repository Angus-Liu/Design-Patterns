package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月16日 下午8:42:01 
 * @version 1.0 
 */
// AccessValidator：身份验证类，业务类，提供validate()方法实现身份验证
public class AccessValidator {
	// 模拟实现登录验证
	public boolean validate(String userId) {
		System.out.println("在数据库中验证用户'" + userId + "'是否是合法用户");
		if ("Angus".equals(userId)) {
			System.out.println("登录成功！");
			return true;
		} else {
			System.out.println("'" + userId + "'不是合法用户，登录失败！");
			return false;
		}
	}
}
