package com.angus.project;

import java.io.IOException;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����8:59:09 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		WeeklyLog log_previous = new WeeklyLog(); // ����ԭ�Ͷ���

		Attachment attachment = new Attachment(); // ������������

		log_previous.setName("����ʼ�");
		log_previous.setDate("2018-3-15");
		log_previous.setContent("���ǲ�˹���и�");
		log_previous.setAttachment(attachment);

		System.out.println("****�ܱ�****");
		System.out.println("ʱ�䣺" + log_previous.getDate());
		System.out.println("���֣�" + log_previous.getName());
		System.out.println("���ݣ�" + log_previous.getContent());
		System.out.println("--------------------------------");

		WeeklyLog log_new = null;
		try {
			log_new = log_previous.deepClone();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log_new.setDate("2018-4-1");
		System.out.println("****�ܱ�****");
		System.out.println("ʱ�䣺" + log_new.getDate());
		System.out.println("���֣�" + log_new.getName());
		System.out.println("���ݣ�" + log_new.getContent());
		System.out.println("--------------------------------");

		// System.out.println(log_previous == log_new);
		// System.out.println(log_previous.getDate() == log_new.getDate());
		// System.out.println(log_previous.getName() == log_new.getName());
		// System.out.println(log_previous.getContent() ==
		// log_new.getContent());

		System.out.println("�ܱ��Ƿ���ͬ:" + (log_previous == log_new));
		System.out.println("�����Ƿ���ͬ:" + (log_previous.getAttachment() == log_new.getAttachment()));
	}
}