package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 下午1:15:49 
 * @version 1.0 
 */
// 账户类：充当抽象类
abstract class Account {
	// 基本方法 —— 具体方法
	public boolean validate(String account, String password) {
		System.out.println("账号：" + account);
		System.out.println("密码：" + password);
		if ("angus".equalsIgnoreCase(account) && "123".equalsIgnoreCase(password)) {
			return true;
		} else {
			return false;
		}
	}

	// 基本方法 —— 抽象方法
	public abstract void calculateInterest();

	// 基本方法 —— 具体方法
	public void display() {
		System.out.println("显示利息！");
	}

	// 模板方法
	public void handle(String account, String password) {
		if (!validate(account, password)) {
			System.out.println("账号或密码错误！");
			return;
		}
		calculateInterest();
		display();
	}
}
