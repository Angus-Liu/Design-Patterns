package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��18�� ����10:03:44 
 * @version 1.0 
 */
// �����˻���������
public class Account {
	private AccountState state; // ά��һ���Գ���״̬���������
	private String owner; // ������
	private double balance = 0; // �˻����

	public Account(String owner, double init) {
		this.owner = owner;
		this.balance = init;
		this.state = new NormalState(this); // ���ó�ʼ״̬
		System.out.println(this.owner + "��������ʼ���Ϊ����" + init);
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

	// ���
	public void deposit(double amount) {
		System.out.println(this.owner + "���:��" + amount);
		state.deposit(amount); // ����״̬�����Ӧ����
		System.out.println("�˻�����" + this.balance);
		System.out.println("�˻�״̬��" + this.state.getStateName());
		System.out.println("-------------------------------");
	}

	// ȡ��
	public void withdraw(double amount) {
		System.out.println(this.owner + "ȡ���" + amount);
		state.withdraw(amount); // ����״̬�����Ӧ����
		System.out.println("�˻�����" + this.balance);
		System.out.println("�˻�״̬��" + this.state.getStateName());
		System.out.println("-------------------------------");
	}

	// ������Ϣ
	public void computeInterest() {
		state.computeInterest();
	}

}
