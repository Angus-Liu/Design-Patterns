package com.angus.project;

import java.util.ArrayList;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����9:40:24 
 * @version 1.0 
 */

// ս�ӿ��������ࣺĿ����
public abstract class AllyControlCenter {

	protected String allyName; // ս������
	protected ArrayList<Observer> players = new ArrayList<Observer>(); // ����һ���������ڴ洢ս�ӳ�Ա

	public void setAllyName(String allyName) {
		this.allyName = allyName;
	}

	public String getAllyName() {
		return this.allyName;
	}

	// ע�᷽��
	public void join(Observer obs) {
		System.out.println(obs.getName() + "����" + this.allyName + "ս�ӣ�");
		players.add(obs);
	}

	// ע������
	public void quit(Observer obs) {
		System.out.println(obs.getName() + "�˳�" + this.allyName + "ս�ӣ�");
		players.remove(obs);
	}

	// ��������֪ͨ����
	public abstract void notifyObserver(String name);

}
