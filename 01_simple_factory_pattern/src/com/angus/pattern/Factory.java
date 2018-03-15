package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018年3月13日 下午5:46:39 
 * @version 1.0 
 */
class Factory {
	// 静态工厂方法
	public static Product getProduct(String arg) {
		Product product = null;
		if (arg.equalsIgnoreCase("A")) {
			product = new ConcreteProductA();
			// 初始化设置product
		} else if (arg.equalsIgnoreCase("B")) {
			product = new ConcreteProductB();
			// 初始化设置product
		}
		return product;
	}
}
