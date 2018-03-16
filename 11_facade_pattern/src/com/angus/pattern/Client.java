package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018年3月16日 下午5:03:09 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		EncryptFacade ef = new EncryptFacade();
		ef.FileEncrypt("src.txt", "des.txt");
	}
}
