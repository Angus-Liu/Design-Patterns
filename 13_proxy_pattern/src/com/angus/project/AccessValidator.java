package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��16�� ����8:42:01 
 * @version 1.0 
 */
// AccessValidator�������֤�࣬ҵ���࣬�ṩvalidate()����ʵ�������֤
public class AccessValidator {
	// ģ��ʵ�ֵ�¼��֤
	public boolean validate(String userId) {
		System.out.println("�����ݿ�����֤�û�'" + userId + "'�Ƿ��ǺϷ��û�");
		if ("Angus".equals(userId)) {
			System.out.println("��¼�ɹ���");
			return true;
		} else {
			System.out.println("'" + userId + "'���ǺϷ��û�����¼ʧ�ܣ�");
			return false;
		}
	}
}
