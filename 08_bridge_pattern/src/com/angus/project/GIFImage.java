package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����4:44:06 
 * @version 1.0 
 */
// GIF��ʽͼ�����������
public class GIFImage extends Image {

	@Override
	public void parseFile(String fileName) {
		// ģ�����GIF�ļ������һ�����ؾ���
		Matrix m = new Matrix();
		imp.doPaint(m);
		System.out.println(fileName + ",��ʽΪGIF");
	}

}
