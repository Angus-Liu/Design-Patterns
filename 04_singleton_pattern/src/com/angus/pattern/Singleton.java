package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018年3月14日 下午10:07:49 
 * @version 1.0 
 */
// Initialization on Demand Holder
class Singleton {
	private Singleton() {
	}

	private static class HolderClass {
		private final static Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return HolderClass.instance;
	}

	public static void main(String args[]) {
		Singleton s1, s2;
		s1 = Singleton.getInstance();
		s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
	}
}
