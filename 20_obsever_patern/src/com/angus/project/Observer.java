package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午9:38:08 
 * @version 1.0 
 */
// 抽象观察者类
public interface Observer {
	public String getName();
	public void setName(String name);
	public void help(); // 声明支援盟友方法
	public void beAttacked(AllyControlCenter acc); // 声明遭受攻击方法
}
