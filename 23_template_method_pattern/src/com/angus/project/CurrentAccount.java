package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 下午1:21:47 
 * @version 1.0 
 */
// 活期账户类：具体子类
public class CurrentAccount extends Account {

	// 覆盖父类的抽象基本方法
	@Override
	public void calculateInterest() {
		System.out.println("按活期利率计算利息！");
	}
}
