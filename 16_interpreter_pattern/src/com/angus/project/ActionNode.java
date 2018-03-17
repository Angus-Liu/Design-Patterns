package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����4:04:37 
 * @version 1.0 
 */
// �������ͣ��ս�����ʽ
public class ActionNode extends AbstractNode {

	private String action;

	public ActionNode(String action) {
		this.action = action;
	}

	// �������ʽ�Ľ��Ͳ���
	@Override
	public String interpret() {
		if ("move".equalsIgnoreCase(action)) {
			return "�ƶ�";
		} else if ("run".equalsIgnoreCase(action)) {
			return "�����ƶ�";
		} else if ("leap".equalsIgnoreCase(action)) {
			return "��Ծ";
		} else {
			return "��Чָ��";
		}
	}

}
