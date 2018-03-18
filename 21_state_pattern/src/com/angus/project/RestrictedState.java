package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��18�� ����10:41:21 
 * @version 1.0 
 */
// ����״̬������״̬��
public class RestrictedState extends AccountState {

	public RestrictedState(Account account) {
		super(account);
		setStateName("����״̬");
	}

	@Override
	public void deposit(double amount) {
		account.setBalance(account.getBalance() + amount);
		stateCheck();
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("�˺����ޣ�ȡ��ʧ�ܣ�");
	}

	@Override
	public void computeInterest() {
		System.out.println("������Ϣ");
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
