package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 上午9:31:05 
 * @version 1.0 
 */
// 最小化命令类：具体命令类
public class MinimizeCommand extends Command {

	private WindowHandler wReceiver;
	
	public MinimizeCommand() {
		wReceiver = new WindowHandler();
	}
	
	// 命令执行方法，将调用接收者的业务方法
	@Override
	public void execute() {
		wReceiver.minimize();
	}

}
