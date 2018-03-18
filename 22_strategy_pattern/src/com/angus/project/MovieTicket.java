package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��18�� ����11:55:26 
 * @version 1.0 
 */

// ��ӰƱ�ࣺ������
public class MovieTicket {
	private double price;
	private Discount discount; // ά��һ���Գ����ۿ��������

	// ע��һ���ۿ������
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		// �����ۿ�����ۿۼ��㷽��
		return discount.calculate(this.price);
	}
}
