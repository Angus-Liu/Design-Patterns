package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午7:35:10 
 * @version 1.0 
 */

// 文本框类：具体同事类
public class TextBox extends Component {

	@Override
	public void update() {
		System.out.println("客户信息添加成功后文本框清空。");
	}
	
	public void setText() {
		System.out.println("文本框显示：小龙女");
	}

}
