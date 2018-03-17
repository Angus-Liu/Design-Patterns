package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����3:58:25 
 * @version 1.0 
 */

// �򵥾��ӽ��ͣ����ս�����ʽ
public class SentenceNode extends AbstractNode {
	private AbstractNode direction;
	private AbstractNode action;
	private AbstractNode distance;

	public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
		this.direction = direction;
		this.action = action;
		this.distance = distance;
	}

	// �򵥾��ӵĽ��Ͷ���
	@Override
	public String interpret() {
		return direction.interpret() + action.interpret() + distance.interpret();
	}

}
