package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��18�� ����12:03:59 
 * @version 1.0 
 */

// ��ͯƱ�ۿ��ࣺ���������
public class ChildrenDiscount extends Discount {

	@Override
	public double calculate(double price) {
		System.out.println("��ͯƱ��");
		return price * 0.5;
	}

}