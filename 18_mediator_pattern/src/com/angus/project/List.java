package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午7:28:59 
 * @version 1.0 
 */

// 列表框类：具体同事类
public class List extends Component {

	@Override
	public void update() {
		System.out.println("列表框添加一项：张无忌。");
	}

	public void select() {
		System.out.println("列表框选中项：小龙女。");
	}

}
