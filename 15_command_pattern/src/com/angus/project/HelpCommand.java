package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����9:27:10 
 * @version 1.0 
 */
// ���������ࣺ����������
public class HelpCommand extends Command {

	public HelpHandler hReciver; //ά�ֶԽ����ߵ�����
	
	public HelpCommand() {
		hReciver = new HelpHandler();
	}
	
	// ����ִ�з����������ý����ߵ�ҵ�񷽷�
	@Override
	public void execute() {
		hReciver.display();
	}

}
