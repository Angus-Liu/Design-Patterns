package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 上午9:27:10 
 * @version 1.0 
 */
// 帮助命令类：具体命令类
public class HelpCommand extends Command {

	public HelpHandler hReciver; //维持对接收者的引用
	
	public HelpCommand() {
		hReciver = new HelpHandler();
	}
	
	// 命令执行方法，将调用接收者的业务方法
	@Override
	public void execute() {
		hReciver.display();
	}

}
