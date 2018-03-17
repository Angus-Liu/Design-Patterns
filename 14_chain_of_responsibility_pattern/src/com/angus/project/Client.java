package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 上午8:12:07 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		Approver direcor, vicePresident, president, congress;
		direcor = new Director("安平");
		vicePresident = new VicePresident("安光");
		president = new President("建荣");
		congress = new Congress("董事会");
		
		// 创建职责链
		direcor.setSuccessor(vicePresident);
		vicePresident.setSuccessor(president);
		president.setSuccessor(congress);
		
		// 创建采购单
		PurchaseRequest pr1 = new PurchaseRequest(100, 10001, "买王者荣耀装备");
		direcor.proceddRequest(pr1);
		
		PurchaseRequest pr2 = new PurchaseRequest(99999, 10002, "买手机");
		direcor.proceddRequest(pr2);
		
		PurchaseRequest pr3 = new PurchaseRequest(490000, 10003, "买跑车");
		direcor.proceddRequest(pr3);
		
		PurchaseRequest pr4 = new PurchaseRequest(10000000, 10004, "买豪宅");
		direcor.proceddRequest(pr4);
		
	}
}
