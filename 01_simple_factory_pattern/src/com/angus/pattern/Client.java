package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018年3月13日 下午5:49:44 
 * @version 1.0 
 */
class Client {
	public static void main(String[] args) {
		Product product;
		product = Factory.getProduct("A");
		product.methodSame();
		product.methodDiff();
		
		product = Factory.getProduct("B");
		product.methodSame();
		product.methodDiff();
	}
}
