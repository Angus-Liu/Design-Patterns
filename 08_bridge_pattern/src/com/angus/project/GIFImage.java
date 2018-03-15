package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 下午4:44:06 
 * @version 1.0 
 */
// GIF格式图像：扩充抽象类
public class GIFImage extends Image {

	@Override
	public void parseFile(String fileName) {
		// 模拟解析GIF文件并获得一个像素矩阵
		Matrix m = new Matrix();
		imp.doPaint(m);
		System.out.println(fileName + ",格式为GIF");
	}

}
