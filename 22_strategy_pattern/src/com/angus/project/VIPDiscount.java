package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 下午12:05:19 
 * @version 1.0 
 */
// VIP会员票折扣类：具体策略类
public class VIPDiscount extends Discount {

	@Override
	public double calculate(double price) {
		System.out.println("VIP票！");
		System.out.println("增加积分！");
		return price * 0.4;
	}

}
