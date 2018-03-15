package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����11:19:30 
 * @version 1.0 
 */

// ��ʹ��ɫ�����������彨����
public class AngelBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("Angel");
	}

	@Override
	public void buildSex() {
		actor.setSex("Women");
	}

	@Override
	public void buildFace() {
		actor.setFace("Beautiful");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("White skirt");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("Tresses");
	}

}
