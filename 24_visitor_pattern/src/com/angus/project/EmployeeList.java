package com.angus.project;

import java.util.ArrayList;

/** 
 * @author GuangSIR 
 * @date 2018��3��18�� ����2:13:09 
 * @version 1.0 
 */
public class EmployeeList {
	// ����һ���������ڴ洢Ա������
	private ArrayList<Employee> list = new ArrayList<Employee>();

	public void addEmployee(Employee employee) {
		list.add(employee);
	}

	// ��������Ա�������е�ÿһ��Ա������
	public void accept(Department handler) {
		for (Object obj : list) {
			((Employee) obj).accept(handler);
		}
	}
}
