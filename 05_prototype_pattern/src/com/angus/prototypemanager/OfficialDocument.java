package com.angus.prototypemanager;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����9:49:24 
 * @version 1.0 
 */
// �����Ľӿڣ�Ҳ���Զ���Ϊ�����࣬�ṩclone��������ҵ�񷽷�����Ϊ���󷽷�
public interface OfficialDocument extends Cloneable {
	public OfficialDocument clone();

	public void display();
}