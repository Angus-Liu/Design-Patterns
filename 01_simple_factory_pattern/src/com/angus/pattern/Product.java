package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018��3��13�� ����5:38:30 
 * @version 1.0 
 */
abstract class Product {
	// ���в�Ʒ��Ĺ���ҵ�񷽷�
	public void methodSame(){
		// ����������ʵ��
		System.out.println("This is methodSame");
	}
	
	// ��������ҵ�񷽷�
	public abstract void methodDiff();
}
