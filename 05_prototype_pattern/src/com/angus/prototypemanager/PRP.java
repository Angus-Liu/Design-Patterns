package com.angus.prototypemanager;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����10:10:19 
 * @version 1.0 
 */

// ��Ŀ��չ����
public class PRP implements OfficialDocument {

	@Override
	public OfficialDocument clone() {
		OfficialDocument od = null;
		try {
			od = (OfficialDocument) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return od;
	}

	@Override
	public void display() {
		System.out.println("����Ŀ��չ���桷");
	}

}
