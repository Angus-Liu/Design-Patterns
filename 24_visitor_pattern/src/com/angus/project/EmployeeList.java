package com.angus.project;

import java.util.ArrayList;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 下午2:13:09 
 * @version 1.0 
 */
public class EmployeeList {
	// 定义一个集合用于存储员工对象
	private ArrayList<Employee> list = new ArrayList<Employee>();

	public void addEmployee(Employee employee) {
		list.add(employee);
	}

	// 遍历访问员工集合中的每一个员工对象
	public void accept(Department handler) {
		for (Object obj : list) {
			((Employee) obj).accept(handler);
		}
	}
}
