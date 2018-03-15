package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 下午8:09:44 
 * @version 1.0 
 */
// 抽象文件类：抽象构件
abstract class AbstractFile {
	public abstract void add(AbstractFile file);
	public abstract void remove(AbstractFile file);
	public abstract AbstractFile getChild(int i);
	public abstract void killVirus();
}
