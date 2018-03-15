package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 下午4:28:10 
 * @version 1.0 
 */
// 抽象图像类：抽象类
public abstract class Image {
	protected ImageImp imp;
	
	public void setImageImp(ImageImp imp){
		this.imp = imp;
	}
	
	public abstract void parseFile(String fileName);
}
