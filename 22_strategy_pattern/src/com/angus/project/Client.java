package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��18�� ����12:07:56 
 * @version 1.0 
 */
class Client {
	public static void main(String args[]) {
		MovieTicket mt = new MovieTicket();
		double originalPrice = 60.0;
		double currentPrice;

		mt.setPrice(originalPrice);
		System.out.println("ԭʼ��Ϊ��" + originalPrice);
		System.out.println("---------------------------------");

		Discount discount;
		discount = (Discount) XMLUtil.getBean(); // ��ȡ�����ļ����������ɾ����ۿ۶���
		mt.setDiscount(discount); // ע���ۿ۶���

		currentPrice = mt.getPrice();
		System.out.println("�ۺ��Ϊ��" + currentPrice);
	}
}
