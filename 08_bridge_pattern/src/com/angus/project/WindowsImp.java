package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 下午4:31:37 
 * @version 1.0 
 */
// Windows操作系统实现类：具体实现类
public class WindowsImp implements ImageImp{

	@Override
	public void doPaint(Matrix m) {
		// 调用Windows系统的绘制函数绘制像素矩阵
		System.out.print("在Windows中显示图像：");
	}

}
