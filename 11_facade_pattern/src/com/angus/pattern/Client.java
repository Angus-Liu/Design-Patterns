package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018��3��16�� ����5:03:09 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		EncryptFacade ef = new EncryptFacade();
		ef.FileEncrypt("src.txt", "des.txt");
	}
}
