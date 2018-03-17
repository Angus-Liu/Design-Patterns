package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����7:59:07 
 * @version 1.0 
 */
// �ɹ��ࣺ������
public class PurchaseRequest {
	private double amount; // �ɹ����
	private int number; // �ɹ������
	private String purpose; // �ɹ�Ŀ��

	public PurchaseRequest(double amount, int number, String purpose) {
		this.amount = amount;
		this.number = number;
		this.purpose = purpose;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

}
