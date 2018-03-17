package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����4:07:39 
 * @version 1.0 
 */
// ������ͣ��ս�����ʽ
public class DistanceNode extends AbstractNode {

	private String distance;

	public DistanceNode(String distance) {
		this.distance = distance;
	}

	// ������ʽ�Ľ��Ͷ���
	@Override
	public String interpret() {
		return distance;
	}

}
