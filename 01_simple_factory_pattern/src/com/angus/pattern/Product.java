package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018年3月13日 下午5:38:30 
 * @version 1.0 
 */
abstract class Product {
	// 所有产品类的公共业务方法
	public void methodSame(){
		// 公共方法的实现
		System.out.println("This is methodSame");
	}
	
	// 声明抽象业务方法
	public abstract void methodDiff();
}
