package com.angus.calculator;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����11:14:17 
 * @version 1.0 
 */

// �ӷ��ࣺ���������
public class Adder {
	private int num = 0; // �����ʼֵΪ0
	
	// �ӷ�������ÿ�ν������ֵ��num�����㣬�ٽ��������
	public int add(int value){
		num += value;
		return num;
	}
}
