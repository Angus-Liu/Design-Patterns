package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����8:01:09 
 * @version 1.0 
 */
// �����ߣ���������
public abstract class Approver {
	protected Approver successor; // ��������
	protected String name; // ����������

	public Approver(String name) {
		this.name = name;
	}

	// ���ú����
	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}

	// ��������
	public abstract void proceddRequest(PurchaseRequest request);
}
