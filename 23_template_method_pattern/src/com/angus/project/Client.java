package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��18�� ����1:26:20 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		Account account = (Account) XMLUtil.getBean();
		account.handle("Angus", "123");
	}
}
