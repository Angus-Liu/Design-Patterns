package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 上午10:41:21 
 * @version 1.0 
 */
// 受限状态：具体状态类
public class RestrictedState extends AccountState {

	public RestrictedState(Account account) {
		super(account);
		setStateName("受限状态");
	}

	@Override
	public void deposit(double amount) {
		account.setBalance(account.getBalance() + amount);
		stateCheck();
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("账号受限，取款失败！");
	}

	@Override
	public void computeInterest() {
		System.out.println("计算利息");
	}

	@Override
	public void stateCheck() {
		if (account.getBalance() > 0) {
			account.setState(new NormalState(account));
		} else if (account.getBalance() > -2000) {
			account.setState(new OverdraftState(account));
		}
	}

}
