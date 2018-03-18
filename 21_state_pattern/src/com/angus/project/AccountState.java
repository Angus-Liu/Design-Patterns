package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 上午10:04:44 
 * @version 1.0 
 */

// 抽象状态类
public abstract class AccountState {

	private String stateName;

	protected Account account;

	public AccountState(Account account) {
		this.account = account;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public abstract void computeInterest();

	public abstract void stateCheck();

}
