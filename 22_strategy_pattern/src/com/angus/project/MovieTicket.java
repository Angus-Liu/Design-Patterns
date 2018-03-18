package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 上午11:55:26 
 * @version 1.0 
 */

// 电影票类：环境类
public class MovieTicket {
	private double price;
	private Discount discount; // 维持一个对抽象折扣类的引用

	// 注入一个折扣类对象
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		// 调用折扣类的折扣计算方法
		return discount.calculate(this.price);
	}
}
