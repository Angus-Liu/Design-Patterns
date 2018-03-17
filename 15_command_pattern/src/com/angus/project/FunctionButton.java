package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����9:20:19 
 * @version 1.0 
 */
// ���ܼ��ࣺ��������
public class FunctionButton {

	private String name; // ���ܼ�����
	private Command command; // ά��һ������������������
	
	public FunctionButton(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	// Ϊ���ܼ�ע������
	public void setCommand(Command command) {
		this.command = command;
	}
	
	// ��������ķ���
	public void onClick(){
		System.out.println("������ܼ���");
		command.execute();
	}

}
