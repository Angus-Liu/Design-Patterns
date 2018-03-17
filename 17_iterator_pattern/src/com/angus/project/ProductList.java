package com.angus.project;

import java.util.List;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����5:41:05 
 * @version 1.0 
 */

// ��Ʒ�����ࣺ����ۺ���
public class ProductList extends AbstractList {

	public ProductList() {
	}

	public ProductList(List<Object> objects) {
		super(objects);
	}

	// ʵ�ִ�������������ľ��幤������
	@Override
	public AbstractIterator createIterator() {
		return new ProductIterator(this);
	}

}
