package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����9:49:13 
 * @version 1.0 
 */
public class Player implements Observer {

	private String name;

	public Player(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void help() {
		System.out.println("���ס��" + this.name + "�����㣡");
	}

	// ���ܹ���������ʵ�֣������ܹ���ʱ������ս�ӿ����������֪ͨ����notifyObserver()��֪ͨ����
	@Override
	public void beAttacked(AllyControlCenter acc) {
		System.out.println(this.name + "������");
		acc.notifyObserver(name);
	}

}
