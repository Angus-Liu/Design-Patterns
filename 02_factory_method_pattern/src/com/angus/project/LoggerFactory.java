package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月14日 下午8:25:33 
 * @version 1.0 
 */
// 日志记录器工厂接口：抽象工厂
interface LoggerFactory {
	public Logger createLogger();
}