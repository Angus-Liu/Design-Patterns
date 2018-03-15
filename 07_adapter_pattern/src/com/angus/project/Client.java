package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 下午3:18:31 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		ScoreOperation operation; // 针对抽象接口编程
		operation = (ScoreOperation) XMLUtil.getBean(); // 读取配置文件，反射生成对象

		int[] scores = { 84, 76, 50, 69, 90, 91, 88, 96 }; // 定义成绩数组
		int[] result;
		int score;

		System.out.println("成绩排序结果：");
		result = operation.sort(scores);

		// 遍历输出成绩
		for (int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("查找成绩90分：");
		score = operation.search(result, 90);
		if (score != -1) {
			System.out.println("找到成绩90！");
		} else {
			System.out.println("没有找到成绩90！");
		}
		
		System.out.print("查找成绩100分：");
		score = operation.search(result, 100);
		if (score != -1) {
			System.out.println("找到成绩100！");
		} else {
			System.out.println("没有找到成绩100！");
		}
	}
}
