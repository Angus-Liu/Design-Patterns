package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��18�� ����1:15:49 
 * @version 1.0 
 */
// �˻��ࣺ�䵱������
abstract class Account {
	// �������� ���� ���巽��
	public boolean validate(String account, String password) {
		System.out.println("�˺ţ�" + account);
		System.out.println("���룺" + password);
		if ("angus".equalsIgnoreCase(account) && "123".equalsIgnoreCase(password)) {
			return true;
		} else {
			return false;
		}
	}

	// �������� ���� ���󷽷�
	public abstract void calculateInterest();

	// �������� ���� ���巽��
	public void display() {
		System.out.println("��ʾ��Ϣ��");
	}

	// ģ�巽��
	public void handle(String account, String password) {
		if (!validate(account, password)) {
			System.out.println("�˺Ż��������");
			return;
		}
		calculateInterest();
		display();
	}
}
