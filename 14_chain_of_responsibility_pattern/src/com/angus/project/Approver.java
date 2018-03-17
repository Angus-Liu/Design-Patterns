package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 上午8:01:09 
 * @version 1.0 
 */
// 审批者：抽象处理者
public abstract class Approver {
	protected Approver successor; // 定义后继者
	protected String name; // 审批者姓名

	public Approver(String name) {
		this.name = name;
	}

	// 设置后继者
	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}

	// 抽象处理方法
	public abstract void proceddRequest(PurchaseRequest request);
}
