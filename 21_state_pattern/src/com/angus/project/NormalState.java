package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��18�� ����10:07:56 
 * @version 1.0 
 */
// ����״̬�ࣺ����״̬��
public class NormalState extends AccountState {

	public NormalState(Account account) {
		super(account);
		setStateName("��ͨ״̬");
	}

	@Override
	public void deposit(double amount) {
		account.setBalance(account.getBalance() + amount);
		stateCheck();
	}

	@Override
	public void withdraw(double amount) {
		account.setBalance(account.getBalance() - amount);
		stateCheck();
	}

	@Override
	public void computeInterest() {
		System.out.println("�˻���������״̬��û�в�����Ϣ��");
	}

	// ״̬ת��
	@Override
	public void stateCheck() {
		if (account.getBalance() <= -2000) {
			account.setState(new RestrictedState(account));
		} else if (account.getBalance() <= 0) {
			account.setState(new OverdraftState(account));
		}
	}

}