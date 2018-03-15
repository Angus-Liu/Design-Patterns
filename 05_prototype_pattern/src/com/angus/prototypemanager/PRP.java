package com.angus.prototypemanager;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 上午10:10:19 
 * @version 1.0 
 */

// 项目进展报告
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
		System.out.println("《项目进展报告》");
	}

}
