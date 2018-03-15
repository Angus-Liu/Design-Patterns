package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018��3��13�� ����5:46:39 
 * @version 1.0 
 */
class Factory {
	// ��̬��������
	public static Product getProduct(String arg) {
		Product product = null;
		if (arg.equalsIgnoreCase("A")) {
			product = new ConcreteProductA();
			// ��ʼ������product
		} else if (arg.equalsIgnoreCase("B")) {
			product = new ConcreteProductB();
			// ��ʼ������product
		}
		return product;
	}
}
