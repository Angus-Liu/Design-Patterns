package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��18�� ����2:06:39 
 * @version 1.0 
 */

// �����ࣺ���������
abstract class Department {
	// ����һ�����صķ��ʷ��������ڷ��ʲ�ͬ���͵ľ���Ԫ��
	public abstract void visit(FulltimeEmployee employee);

	public abstract void visit(ParttimeEmployee employee);
}
