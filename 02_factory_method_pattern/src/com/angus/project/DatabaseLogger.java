package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月14日 下午8:23:55 
 * @version 1.0 
 */
// 数据库日志记录器：具体产品
class DatabaseLogger implements Logger {
	public void writeLog() {
		System.out.println("数据库日志记录。");
	}
}
