package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 下午9:32:18 
 * @version 1.0 
 */
// 黑色边框装饰类：具体装饰类
public class BlackBorderDecorator extends ComponentDecorator {

	public BlackBorderDecorator(Component component) {
		super(component);
	}

	@Override
	public void display() {
		setBlackBorder();
		super.display();
	}

	public void setBlackBorder() {
		System.out.println("为构件增加黑色边框！");
	}

}
