package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��18�� ����2:12:33 
 * @version 1.0 
 */
public class HRDepartment extends Department {

	@Override
	public void visit(FulltimeEmployee employee) {
		int workTime = employee.getWorkTime();
		System.out.println("��ʽԱ��" + employee.getName() + "ʵ�ʹ���ʱ��Ϊ��" + workTime + "Сʱ��");
		if (workTime > 40) {
			System.out.println("��ʽԱ��" + employee.getName() + "�Ӱ�ʱ��Ϊ��" + (workTime - 40) + "Сʱ��");
		} else if (workTime < 40) {
			System.out.println("��ʽԱ��" + employee.getName() + "���ʱ��Ϊ��" + (40 - workTime) + "Сʱ��");
		}
	}

	@Override
	public void visit(ParttimeEmployee employee) {
		int workTime = employee.getWorkTime();
		System.out.println("��ʱ��" + employee.getName() + "ʵ�ʹ���ʱ��Ϊ��" + workTime + "Сʱ��");
	}

}