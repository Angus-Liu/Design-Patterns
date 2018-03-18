package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 上午10:03:44 
 * @version 1.0 
 */
// 银行账户：环境类
public class Account {
	private AccountState state; // 维持一个对抽象状态对象的引用
	private String owner; // 开户名
	private double balance = 0; // 账户余额

	public Account(String owner, double init) {
		this.owner = owner;
		this.balance = init;
		this.state = new NormalState(this); // 设置初始状态
		System.out.println(this.owner + "开户，初始金额为：￥" + init);
	}

	public AccountState getState() {
		return state;
	}

	public void setState(AccountState state) {
		this.state = state;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// 存款
	public void deposit(double amount) {
		System.out.println(this.owner + "存款:￥" + amount);
		state.deposit(amount); // 调用状态对象对应方法
		System.out.println("账户余额：￥" + this.balance);
		System.out.println("账户状态：" + this.state.getStateName());
		System.out.println("-------------------------------");
	}

	// 取款
	public void withdraw(double amount) {
		System.out.println(this.owner + "取款：￥" + amount);
		state.withdraw(amount); // 调用状态对象对应方法
		System.out.println("账户余额：￥" + this.balance);
		System.out.println("账户状态：" + this.state.getStateName());
		System.out.println("-------------------------------");
	}

	// 计算利息
	public void computeInterest() {
		state.computeInterest();
	}

}
