package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月14日 下午8:26:35 
 * @version 1.0 
 */
// 数据库日志记录器工厂类：具体工厂
class DatabaseLoggerFactory implements LoggerFactory {
	public Logger createLogger() {
		// 连接数据库，代码省略
		// 创建数据库日志记录器对象
		Logger logger = new DatabaseLogger();
		// 初始化数据库日志记录器，代码省略
		return logger;
	}
}