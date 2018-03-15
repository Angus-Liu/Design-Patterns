package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����11:27:13 
 * @version 1.0 
 */

// ��Ϸ��ɫ������������ָ����
public class ActorController {
	// �𲽹������Ӳ�Ʒ����
	public Actor construct(ActorBuilder ab){
		Actor actor;
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		ab.buildHairstyle();
		actor = ab.createActor();
		return actor;
	}
}
