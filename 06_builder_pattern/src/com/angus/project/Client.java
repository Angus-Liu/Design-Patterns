package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����11:39:33 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		ActorBuilder ab; // ��Գ������߱��
		ab = (ActorBuilder) XMLUtil.getBean();

		ActorController ac = new ActorController();
		Actor actor;
		actor = ac.construct(ab); // ͨ��ָ���ߴ��������Ľ����߶���

		System.out.println(actor.getType() + "����ۣ�");
		System.out.println("�Ա�" + actor.getSex());
		System.out.println("���ݣ�" + actor.getFace());
		System.out.println("��װ��" + actor.getCostume());
		System.out.println("���ͣ�" + actor.getHairstyle());
		
	}
}
