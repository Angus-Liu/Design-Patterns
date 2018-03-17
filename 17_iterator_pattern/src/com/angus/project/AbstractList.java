package com.angus.project;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����5:35:22 
 * @version 1.0 
 */
// �ڱ�ʵ���У�Ϊ����ϸ˵���Զ����������ʵ�ֹ��̣�
// ����û��ʹ��JDK�����õĵ���������ʵ�ϣ�
// JDK���õ������Ѿ�ʵ���˶�һ��List������������

// ����ۺ���
public abstract class AbstractList {
	protected List<Object> objects = new ArrayList<>();

	public AbstractList() {}

	public AbstractList(List<Object> objects) {
		this.objects = objects;
	}

	public void addObject(Object obj) {
		objects.add(obj);
	}

	public void removeObject(Object obj) {
		objects.remove(obj);
	}

	public List<Object> getObjects() {
		return this.objects;
	}

	// ���������������ĳ��󹤳�����
	public abstract AbstractIterator createIterator();
}