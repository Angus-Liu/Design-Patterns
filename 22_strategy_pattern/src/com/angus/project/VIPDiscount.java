package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��18�� ����12:05:19 
 * @version 1.0 
 */
// VIP��ԱƱ�ۿ��ࣺ���������
public class VIPDiscount extends Discount {

	@Override
	public double calculate(double price) {
		System.out.println("VIPƱ��");
		System.out.println("���ӻ��֣�");
		return price * 0.4;
	}

}
