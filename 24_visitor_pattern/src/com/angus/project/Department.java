package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 下午2:06:39 
 * @version 1.0 
 */

// 部门类：抽象访问者
abstract class Department {
	// 声明一组重载的访问方法，用于访问不同类型的具体元素
	public abstract void visit(FulltimeEmployee employee);

	public abstract void visit(ParttimeEmployee employee);
}
