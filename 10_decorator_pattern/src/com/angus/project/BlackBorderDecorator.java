package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����9:32:18 
 * @version 1.0 
 */
// ��ɫ�߿�װ���ࣺ����װ����
public class BlackBorderDecorator extends ComponentDecorator {

	public BlackBorderDecorator(Component component) {
		super(component);
	}

	@Override
	public void display() {
		setBlackBorder();
		super.display();
	}

	public void setBlackBorder() {
		System.out.println("Ϊ�������Ӻ�ɫ�߿�");
	}

}
