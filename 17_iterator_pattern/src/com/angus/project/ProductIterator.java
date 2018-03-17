package com.angus.project;

import java.util.List;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����5:42:43 
 * @version 1.0 
 */
public class ProductIterator implements AbstractIterator {

	private ProductList productList;
	private List<Object> products;
	private int cursor1; // ����һ���α꣬���ڼ�¼���������λ��
	private int cursor2; // ����һ���α꣬���ڼ�¼���������λ��

	public ProductIterator(ProductList productList) {
		this.productList = productList;
		// ��ȡ���϶���
		this.products = productList.getObjects();
		cursor1 = 0; // ������������α�ĳ�ʼֵ
		cursor2 = products.size() - 1; // ������������α�ĳ�ʼֵ
	}

	@Override
	public void next() {
		if (cursor1 < products.size()) {
			cursor1++;
		}
	}

	@Override
	public boolean isLast() {
		return (cursor1 == products.size());
	}

	@Override
	public void previous() {
		if (cursor2 > -1) {
			cursor2--;
		}
	}

	@Override
	public boolean isFirst() {
		return (cursor2 == -1);
	}

	@Override
	public Object getNextItem() {
		return products.get(cursor1);
	}

	@Override
	public Object getPreviousItem() {
		return products.get(cursor2);
	}

}
