package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018��3��13�� ����5:49:44 
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
