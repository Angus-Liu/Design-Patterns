package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����8:12:29 
 * @version 1.0 
 */
// ͼ���ļ��ࣺҶ�ӹ���
public class ImageFile extends AbstractFile {

	private String name;
	
	public ImageFile(String name) {
		this.name = name;
	}
	
	@Override
	public void add(AbstractFile file) {
		System.out.println("Ҷ�ӽڵ㣬��֧�ִ˷�����");
	}

	@Override
	public void remove(AbstractFile file) {
		System.out.println("Ҷ�ӽڵ㣬��֧�ִ˷�����");
	}

	@Override
	public AbstractFile getChild(int i) {
		System.out.println("Ҷ�ӽڵ㣬��֧�ִ˷�����");
		return null;
	}

	@Override
	public void killVirus() {
		// ģ��ɱ��
		System.out.println("------��ͼ���ļ�'" + name + "'����ɱ��------");
	}

}
