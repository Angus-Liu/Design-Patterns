package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018��3��16�� ����9:25:53 
 * @version 1.0 
 */
// �����ѯ�ࣺ��ʵ������
public class RealSearcher implements Searcher {
	// ģ���ѯ������Ϣ
	@Override
	public String doSearch(String userId, String keyword) {
		System.out.println("�û�'" + userId + "'ʹ�ùؼ���'" + keyword + "'��ѯ������Ϣ��");
		return "���ز�ѯ���";
	}

}
