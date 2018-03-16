package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 下午9:34:22 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		// 使用抽象构件进行定义
		Component component, componentBB, componentBBSB;
		// 定义具体构件并展示
		component = new ListBox();
		component.display();
		System.out.println("----------------------");
		// 定义装饰后的构件并展示
		componentBB = new BlackBorderDecorator(component);
		componentBB.display();
		System.out.println("----------------------");
		// 希望得到一个既有滚动条又有黑色边框的窗体
		componentBBSB = new BlackBorderDecorator(new ScrollBarDecorator(componentBB));
		componentBBSB.display();
	}
}
