package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����3:18:31 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		ScoreOperation operation; // ��Գ���ӿڱ��
		operation = (ScoreOperation) XMLUtil.getBean(); // ��ȡ�����ļ����������ɶ���

		int[] scores = { 84, 76, 50, 69, 90, 91, 88, 96 }; // ����ɼ�����
		int[] result;
		int score;

		System.out.println("�ɼ���������");
		result = operation.sort(scores);

		// ��������ɼ�
		for (int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("���ҳɼ�90�֣�");
		score = operation.search(result, 90);
		if (score != -1) {
			System.out.println("�ҵ��ɼ�90��");
		} else {
			System.out.println("û���ҵ��ɼ�90��");
		}
		
		System.out.print("���ҳɼ�100�֣�");
		score = operation.search(result, 100);
		if (score != -1) {
			System.out.println("�ҵ��ɼ�100��");
		} else {
			System.out.println("û���ҵ��ɼ�100��");
		}
	}
}
