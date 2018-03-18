package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 下午2:05:21 
 * @version 1.0 
 */
// 员工类：抽象元素类
public interface Employee {
	public void accept(Department handler); // 接收一个抽象访问者访问
}
