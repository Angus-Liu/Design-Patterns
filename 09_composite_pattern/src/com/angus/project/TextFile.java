package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����8:16:44 
 * @version 1.0 
 */
// �ı��ļ��ࣺҶ�ӹ���
public class TextFile extends AbstractFile {
	private String name;

	public TextFile(String name) {
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
		System.out.println("------���ı��ļ�'" + name + "'����ɱ��------");
	}

}
