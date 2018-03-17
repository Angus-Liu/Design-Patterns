package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����3:48:43 
 * @version 1.0 
 */

// And���ͣ����ս�����ʽ
public class AndNode extends AbstractNode {
	private AbstractNode left; // And������ʽ
	private AbstractNode right; // And������ʽ

	public AndNode(AbstractNode left, AbstractNode right) {
		this.left = left;
		this.right = right;
	}

	// And���ʽ�Ľ��Ͷ���
	@Override
	public String interpret() {
		return left.interpret() + "��" + right.interpret();
	}

}
