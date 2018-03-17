package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午4:07:39 
 * @version 1.0 
 */
// 距离解释：终结符表达式
public class DistanceNode extends AbstractNode {

	private String distance;

	public DistanceNode(String distance) {
		this.distance = distance;
	}

	// 距离表达式的解释动作
	@Override
	public String interpret() {
		return distance;
	}

}
