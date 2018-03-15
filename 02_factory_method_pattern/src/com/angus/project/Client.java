package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月14日 下午8:03:27 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		LoggerFactory factory;
		Logger logger;
		factory = (LoggerFactory) XMLUtil.getBean();
		logger = factory.createLogger();
		logger.writeLog();
	}
}