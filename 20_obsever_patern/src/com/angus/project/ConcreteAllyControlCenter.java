package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午9:54:03 
 * @version 1.0 
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {

	public ConcreteAllyControlCenter(String name) {
		System.out.println(name + "战队组建成功！");
		System.out.println("----------------------------");
		setAllyName(name);
	}

	@Override
	public void notifyObserver(String name) {
		System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");
		// 遍历观察者集合，调用每一个盟友（自己除外）的支援方法
		for (Object obs : players) {
			if (!((Observer) obs).getName().equalsIgnoreCase(name)) {
				((Observer) obs).help();
			}
		}

	}

}
