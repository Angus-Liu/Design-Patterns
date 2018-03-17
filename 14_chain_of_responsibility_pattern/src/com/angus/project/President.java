package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 上午8:09:59 
 * @version 1.0 
 */
// 董事长类：具体处理类
public class President extends Approver {

	public President(String name) {
		super(name);
	}

	@Override
	public void proceddRequest(PurchaseRequest request) {
		if (request.getAmount() < 500000) {
			// 处理请求
			System.out.println("董事长" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount()
					+ "元，采购目的：" + request.getPurpose() + "。");
		} else {
			// 转发请求
			this.successor.proceddRequest(request);
		}
	}

}
