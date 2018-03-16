package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月16日 下午7:36:42 
 * @version 1.0 
 */
// 围棋棋子类：抽象享元类
public interface IgoChessman {
	public String getColor();

	default public void display(Coordinates coord) {
		System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getX() + "," + coord.getY());
	};
}
