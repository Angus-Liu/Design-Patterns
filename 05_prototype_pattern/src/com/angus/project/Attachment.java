package com.angus.project;

import java.io.Serializable;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����9:11:38 
 * @version 1.0 
 */
public class Attachment implements Serializable{
	private String name; // ������

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void download() {
		System.out.println("���ظ������ļ���Ϊ" + name);
	}
}
