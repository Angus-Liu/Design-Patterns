package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 上午8:10:59 
 * @version 1.0 
 */
// 董事会类：具体处理者
public class Congress extends Approver {

	public Congress(String name) {
		super(name);
	}

	@Override
	public void proceddRequest(PurchaseRequest request) {
		// 处理请求
		System.out.println("召开董事会审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的："
				+ request.getPurpose() + "。");
	}

}
