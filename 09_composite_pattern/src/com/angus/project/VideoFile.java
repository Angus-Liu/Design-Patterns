package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����8:18:42 
 * @version 1.0 
 */
// ��Ƶ�ļ��ࣺҶ�ӹ���
public class VideoFile extends AbstractFile {
	private String name;

	public VideoFile(String name) {
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		System.out.println("Ҷ�ӽڵ㣬��֧�ָ÷�����");
	}

	@Override
	public void remove(AbstractFile file) {
		System.out.println("Ҷ�ӽڵ㣬��֧�ָ÷�����");
	}

	@Override
	public AbstractFile getChild(int i) {
		System.out.println("Ҷ�ӽڵ㣬��֧�ָ÷�����");
		return null;
	}

	@Override
	public void killVirus() {
		// ģ��ɱ��
		System.out.println("------����Ƶ�ļ�'" + name + "'����ɱ��------");
	}

}
