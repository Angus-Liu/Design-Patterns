package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����9:38:08 
 * @version 1.0 
 */
// ����۲�����
public interface Observer {
	public String getName();
	public void setName(String name);
	public void help(); // ����֧Ԯ���ѷ���
	public void beAttacked(AllyControlCenter acc); // �������ܹ�������
}
