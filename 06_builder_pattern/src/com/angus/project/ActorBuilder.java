package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����11:13:54 
 * @version 1.0 
 */

// ��ɫ����������������
public abstract class ActorBuilder {
	protected Actor actor = new Actor();

	public abstract void buildType();

	public abstract void buildSex();

	public abstract void buildFace();

	public abstract void buildCostume();

	public abstract void buildHairstyle();

	// ��������������һ����������Ϸ��ɫ����
	public Actor createActor() {
		return actor;
	}
}
