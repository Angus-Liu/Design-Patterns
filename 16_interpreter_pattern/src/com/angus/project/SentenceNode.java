package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午3:58:25 
 * @version 1.0 
 */

// 简单句子解释：非终结符表达式
public class SentenceNode extends AbstractNode {
	private AbstractNode direction;
	private AbstractNode action;
	private AbstractNode distance;

	public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
		this.direction = direction;
		this.action = action;
		this.distance = distance;
	}

	// 简单句子的解释动作
	@Override
	public String interpret() {
		return direction.interpret() + action.interpret() + distance.interpret();
	}

}
