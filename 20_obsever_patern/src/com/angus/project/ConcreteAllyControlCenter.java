package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����9:54:03 
 * @version 1.0 
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {

	public ConcreteAllyControlCenter(String name) {
		System.out.println(name + "ս���齨�ɹ���");
		System.out.println("----------------------------");
		setAllyName(name);
	}

	@Override
	public void notifyObserver(String name) {
		System.out.println(this.allyName + "ս�ӽ���֪ͨ������" + name + "���ܵ��˹�����");
		// �����۲��߼��ϣ�����ÿһ�����ѣ��Լ����⣩��֧Ԯ����
		for (Object obs : players) {
			if (!((Observer) obs).getName().equalsIgnoreCase(name)) {
				((Observer) obs).help();
			}
		}

	}

}
