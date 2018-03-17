package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����4:01:15 
 * @version 1.0 
 */
// ������ͣ��ս�����ʽ
public class DirectionNode extends AbstractNode {

	private String direction;

	public DirectionNode(String direction) {
		this.direction = direction;
	}

	// ������ʽ�Ľ��Ͷ���
	@Override
	public String interpret() {
		if ("up".equalsIgnoreCase(direction)) {
			return "����";
		} else if ("down".equalsIgnoreCase(direction)) {
			return "����";
		} else if ("left".equalsIgnoreCase(direction)) {
			return "����";
		} else if ("right".equalsIgnoreCase(direction)) {
			return "����";
		} else {
			return "��Чָ��";
		}
	}

}
