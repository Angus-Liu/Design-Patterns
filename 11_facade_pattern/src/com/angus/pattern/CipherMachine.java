package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018年3月16日 下午4:40:14 
 * @version 1.0 
 */
// CipherMachine：数据加密类，充当子系统类
public class CipherMachine {
	public String encrypt(String plainText) {
		System.out.print("数据加密，将明文装换为密文：");
		String es = "";
		char[] chars = plainText.toCharArray();
		for (char c : chars) {
			String ch = (c % 7) + "";
			es += ch;
		}
		System.out.println(es);
		return es;
	}
}
