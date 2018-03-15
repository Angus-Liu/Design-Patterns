package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018年3月13日 下午9:35:34 
 * @version 1.0 
 */
class ConcreteFactory implements Factory {  
    public static String factoryMethod() {  
    	System.out.println("12313");
        return null;  
    } 
    
    public static void main(String[] args) {
//		Factory factory = new ConcreteFactory();
		ConcreteFactory.factoryMethod();
	}
}  
