package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����4:45:26 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		Image image = (Image) XMLUtil.getBean("image");
		ImageImp imp = (ImageImp) XMLUtil.getBean("os");
		image.setImageImp(imp);
		image.parseFile("���");
	}
}