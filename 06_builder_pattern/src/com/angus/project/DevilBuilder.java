package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����11:22:21 
 * @version 1.0 
 */

// ��ħ��ɫ�����������彨����
public class DevilBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("Devil");
	}

	@Override
	public void buildSex() {
		actor.setSex("Lady-boy");
	}

	@Override
	public void buildFace() {
		actor.setFace("Ugly");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("Black clothes");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("Bald");
	}

}