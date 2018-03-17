package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 上午8:08:11 
 * @version 1.0 
 */
// 副董事长类：具体处理者
public class VicePresident extends Approver {

	public VicePresident(String name) {
		super(name);
	}

	// 具体请求方法
	@Override
	public void proceddRequest(PurchaseRequest request) {
		if (request.getAmount() < 100000) {
			// 处理请求
			System.out.println("副董事长" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount()
					+ "元，采购目的：" + request.getPurpose() + "。");
		} else {
			// 转发请求
			this.successor.proceddRequest(request);
		}
	}

}
