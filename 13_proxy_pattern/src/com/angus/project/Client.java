package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��16�� ����9:41:11 
 * @version 1.0 
 */
public class Client {
	// ���ڴ��������ͨ���ļ�����õ�
	// ��Գ����̣��ͻ�������ֱ���ʵ������ʹ�����
	public static void main(String[] args) {
		Searcher searcher = new ProxySearcher();
		String result = searcher.doSearch("Angus", "ƻ��");
		System.out.println(result);
	}
}