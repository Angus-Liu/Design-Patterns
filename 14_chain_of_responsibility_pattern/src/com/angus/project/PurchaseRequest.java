package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 上午7:59:07 
 * @version 1.0 
 */
// 采购类：请求类
public class PurchaseRequest {
	private double amount; // 采购金额
	private int number; // 采购单编号
	private String purpose; // 采购目的

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
