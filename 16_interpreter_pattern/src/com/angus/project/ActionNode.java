package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午4:04:37 
 * @version 1.0 
 */
// 动作解释：终结符表达式
public class ActionNode extends AbstractNode {

	private String action;

	public ActionNode(String action) {
		this.action = action;
	}

	// 动作表达式的解释操作
	@Override
	public String interpret() {
		if ("move".equalsIgnoreCase(action)) {
			return "移动";
		} else if ("run".equalsIgnoreCase(action)) {
			return "快速移动";
		} else if ("leap".equalsIgnoreCase(action)) {
			return "飞跃";
		} else {
			return "无效指令";
		}
	}

}
