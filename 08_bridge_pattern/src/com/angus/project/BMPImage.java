package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 下午4:41:51 
 * @version 1.0 
 */
// BMP格式图像，扩充抽象类
public class BMPImage extends Image {

	@Override
	public void parseFile(String fileName) {
		// 模拟解析BMP文件并获得一个像素矩阵对象
		Matrix m = new Matrix();
		imp.doPaint(m);
		System.out.println(fileName + ",格式为BMP");
	}

}
