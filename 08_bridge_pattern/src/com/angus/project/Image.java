package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����4:28:10 
 * @version 1.0 
 */
// ����ͼ���ࣺ������
public abstract class Image {
	protected ImageImp imp;
	
	public void setImageImp(ImageImp imp){
		this.imp = imp;
	}
	
	public abstract void parseFile(String fileName);
}
