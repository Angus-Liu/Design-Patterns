package com.angus.project;

import java.util.List;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午5:41:05 
 * @version 1.0 
 */

// 商品数据类：具体聚合类
public class ProductList extends AbstractList {

	public ProductList() {
	}

	public ProductList(List<Object> objects) {
		super(objects);
	}

	// 实现创建迭代器对象的具体工厂方法
	@Override
	public AbstractIterator createIterator() {
		return new ProductIterator(this);
	}

}
