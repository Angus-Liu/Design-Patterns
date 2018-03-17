package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����8:12:07 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		Approver direcor, vicePresident, president, congress;
		direcor = new Director("��ƽ");
		vicePresident = new VicePresident("����");
		president = new President("����");
		congress = new Congress("���»�");
		
		// ����ְ����
		direcor.setSuccessor(vicePresident);
		vicePresident.setSuccessor(president);
		president.setSuccessor(congress);
		
		// �����ɹ���
		PurchaseRequest pr1 = new PurchaseRequest(100, 10001, "��������ҫװ��");
		direcor.proceddRequest(pr1);
		
		PurchaseRequest pr2 = new PurchaseRequest(99999, 10002, "���ֻ�");
		direcor.proceddRequest(pr2);
		
		PurchaseRequest pr3 = new PurchaseRequest(490000, 10003, "���ܳ�");
		direcor.proceddRequest(pr3);
		
		PurchaseRequest pr4 = new PurchaseRequest(10000000, 10004, "���լ");
		direcor.proceddRequest(pr4);
		
	}
}
