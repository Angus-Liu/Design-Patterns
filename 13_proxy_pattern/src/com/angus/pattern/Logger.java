package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018年3月16日 下午9:23:46 
 * @version 1.0 
 */
// 日志记录类：业务类
public class Logger {
	// 模拟实现日志记录
	public void log(String userId){
		System.out.println("更新日志，用户'" + userId + "'查询次数加1！");
	}
}
