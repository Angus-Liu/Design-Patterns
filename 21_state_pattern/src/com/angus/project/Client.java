package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 上午10:52:02 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		Account account = new Account("Angus", 0);
		account.deposit(1000);
		account.computeInterest();
		account.withdraw(2000);
		account.computeInterest();
		account.deposit(3000);
		account.computeInterest();
		account.withdraw(4000);
		account.computeInterest();
		account.withdraw(1000);
		account.computeInterest();
	}
}
