package com.angus.calculator;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 上午11:14:17 
 * @version 1.0 
 */

// 加法类：请求接收者
public class Adder {
	private int num = 0; // 定义初始值为0
	
	// 加法操作，每次将传入的值与num做运算，再将结果返回
	public int add(int value){
		num += value;
		return num;
	}
}
