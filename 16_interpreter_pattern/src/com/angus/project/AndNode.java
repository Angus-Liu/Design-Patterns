package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午3:48:43 
 * @version 1.0 
 */

// And解释：非终结符表达式
public class AndNode extends AbstractNode {
	private AbstractNode left; // And的左子式
	private AbstractNode right; // And的右子式

	public AndNode(AbstractNode left, AbstractNode right) {
		this.left = left;
		this.right = right;
	}

	// And表达式的解释动作
	@Override
	public String interpret() {
		return left.interpret() + "再" + right.interpret();
	}

}
