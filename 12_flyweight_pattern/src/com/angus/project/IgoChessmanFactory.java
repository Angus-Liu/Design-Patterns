package com.angus.project;

import java.util.HashMap;

/** 
 * @author GuangSIR 
 * @date 2018年3月16日 下午7:43:25 
 * @version 1.0 
 */
// 围棋棋子工厂类：享元工厂类，使用饿汉式单例模式设计
public class IgoChessmanFactory {
	private static IgoChessmanFactory instance = new IgoChessmanFactory();
	// 使员工HashMap来存储享元对象，充当享元模式
	private static HashMap<String, IgoChessman> hm;

	private IgoChessmanFactory() {
		hm = new HashMap<>();
		IgoChessman black, white;
		black = new BlackIgoChessman();
		hm.put("b", black);
		white = new WhiteIgoChessman();
		hm.put("w", white);
	}

	// 返回享元工厂的唯一实例
	public static IgoChessmanFactory getInstance() {
		return instance;
	}

	// 通过key来获取HashMap中的享元对象
	public IgoChessman getIgoChessman(String color) {
		return hm.get(color);
	}
}
