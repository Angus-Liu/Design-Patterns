package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午4:01:15 
 * @version 1.0 
 */
// 方向解释：终结符表达式
public class DirectionNode extends AbstractNode {

	private String direction;

	public DirectionNode(String direction) {
		this.direction = direction;
	}

	// 方向表达式的解释动作
	@Override
	public String interpret() {
		if ("up".equalsIgnoreCase(direction)) {
			return "向上";
		} else if ("down".equalsIgnoreCase(direction)) {
			return "向下";
		} else if ("left".equalsIgnoreCase(direction)) {
			return "向左";
		} else if ("right".equalsIgnoreCase(direction)) {
			return "向右";
		} else {
			return "无效指令";
		}
	}

}
