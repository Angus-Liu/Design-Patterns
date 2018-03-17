package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����9:31:05 
 * @version 1.0 
 */
// ��С�������ࣺ����������
public class MinimizeCommand extends Command {

	private WindowHandler wReceiver;
	
	public MinimizeCommand() {
		wReceiver = new WindowHandler();
	}
	
	// ����ִ�з����������ý����ߵ�ҵ�񷽷�
	@Override
	public void execute() {
		wReceiver.minimize();
	}

}
