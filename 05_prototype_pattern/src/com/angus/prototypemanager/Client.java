package com.angus.prototypemanager;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 上午10:04:39 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		// 获取原型管理器
		PrototypeManager pm = PrototypeManager.getPrototypeManager();

		OfficialDocument doc1, doc2, doc3, doc4, doc5, doc6;

		doc1 = pm.getOfficialDocument("far");
		doc1.display();
		doc2 = pm.getOfficialDocument("far");
		doc2.display();
		System.out.println(doc1 == doc2);
		
		doc3 = pm.getOfficialDocument("srs");
		doc3.display();
		doc4 = pm.getOfficialDocument("srs");
		doc4.display();
		System.out.println(doc3 == doc4);
		
		doc5 = pm.getOfficialDocument("prp");
		doc5.display();
		doc6 = pm.getOfficialDocument("prp");
		doc6.display();
		System.out.println(doc5 == doc6);
	}
}
