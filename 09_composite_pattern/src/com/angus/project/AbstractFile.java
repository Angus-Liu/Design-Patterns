package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����8:09:44 
 * @version 1.0 
 */
// �����ļ��ࣺ���󹹼�
abstract class AbstractFile {
	public abstract void add(AbstractFile file);
	public abstract void remove(AbstractFile file);
	public abstract AbstractFile getChild(int i);
	public abstract void killVirus();
}
