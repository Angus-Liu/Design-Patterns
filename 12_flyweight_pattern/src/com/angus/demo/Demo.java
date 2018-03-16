package com.angus.demo;

/** 
 * @author GuangSIR 
 * @date 2018年3月16日 下午8:14:02 
 * @version 1.0 
 */
class Demo {

	public static void main(String args[]) {

		String str1 = "abcd";

		String str2 = "abcd";

		String str3 = "ab" + "cd";

		String str4 = "ab";

		str4 += "cd";

		System.out.println(str1 == str2); // true

		System.out.println(str1 == str3); // true

		System.out.println(str1 == str4); //false

		str2 += "e";

		System.out.println(str1 == str2); // false

	}

}
