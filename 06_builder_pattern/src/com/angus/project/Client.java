package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 上午11:39:33 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		ActorBuilder ab; // 针对抽象建造者编程
		ab = (ActorBuilder) XMLUtil.getBean();

		ActorController ac = new ActorController();
		Actor actor;
		actor = ac.construct(ab); // 通过指挥者创建完整的建造者对象

		System.out.println(actor.getType() + "的外观：");
		System.out.println("性别：" + actor.getSex());
		System.out.println("面容：" + actor.getFace());
		System.out.println("服装：" + actor.getCostume());
		System.out.println("发型：" + actor.getHairstyle());
		
	}
}
