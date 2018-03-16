package com.angus.project;

import java.util.HashMap;

/** 
 * @author GuangSIR 
 * @date 2018��3��16�� ����7:43:25 
 * @version 1.0 
 */
// Χ�����ӹ����ࣺ��Ԫ�����࣬ʹ�ö���ʽ����ģʽ���
public class IgoChessmanFactory {
	private static IgoChessmanFactory instance = new IgoChessmanFactory();
	// ʹԱ��HashMap���洢��Ԫ���󣬳䵱��Ԫģʽ
	private static HashMap<String, IgoChessman> hm;

	private IgoChessmanFactory() {
		hm = new HashMap<>();
		IgoChessman black, white;
		black = new BlackIgoChessman();
		hm.put("b", black);
		white = new WhiteIgoChessman();
		hm.put("w", white);
	}

	// ������Ԫ������Ψһʵ��
	public static IgoChessmanFactory getInstance() {
		return instance;
	}

	// ͨ��key����ȡHashMap�е���Ԫ����
	public IgoChessman getIgoChessman(String color) {
		return hm.get(color);
	}
}
