package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����8:10:59 
 * @version 1.0 
 */
// ���»��ࣺ���崦����
public class Congress extends Approver {

	public Congress(String name) {
		super(name);
	}

	@Override
	public void proceddRequest(PurchaseRequest request) {
		// ��������
		System.out.println("�ٿ����»������ɹ�����" + request.getNumber() + "����" + request.getAmount() + "Ԫ���ɹ�Ŀ�ģ�"
				+ request.getPurpose() + "��");
	}

}
