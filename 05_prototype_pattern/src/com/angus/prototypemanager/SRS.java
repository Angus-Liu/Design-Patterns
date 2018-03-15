package com.angus.prototypemanager;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����9:55:08 
 * @version 1.0 
 */
// ����������˵���飨Software Requirements Specification��
public class SRS implements OfficialDocument {

	@Override
	public OfficialDocument clone() {
		OfficialDocument od = null;
		try {
			od = (OfficialDocument) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return od;
	}

	@Override
	public void display() {
		System.out.println("���������˵���顷");
	}

}