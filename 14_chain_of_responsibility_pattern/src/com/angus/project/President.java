package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����8:09:59 
 * @version 1.0 
 */
// ���³��ࣺ���崦����
public class President extends Approver {

	public President(String name) {
		super(name);
	}

	@Override
	public void proceddRequest(PurchaseRequest request) {
		if (request.getAmount() < 500000) {
			// ��������
			System.out.println("���³�" + this.name + "�����ɹ�����" + request.getNumber() + "����" + request.getAmount()
					+ "Ԫ���ɹ�Ŀ�ģ�" + request.getPurpose() + "��");
		} else {
			// ת������
			this.successor.proceddRequest(request);
		}
	}

}
