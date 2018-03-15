package com.angus.project;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����4:49:19 
 * @version 1.0 
 */
public class XMLUtil {
	// �÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
	public static Object getBean(String args) {
		try {
			// �����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("config.xml"));
			NodeList nl = null;
			Node classNode = null;
			String cName = null;
			nl = doc.getElementsByTagName("className");

			if (args.equals("image")) {
				// ��ȡ��һ�����������Ľڵ㣬�����������
				classNode = nl.item(0).getFirstChild();

			} else if (args.equals("os")) {
				// ��ȡ�ڶ������������Ľڵ㣬������ʵ����
				classNode = nl.item(1).getFirstChild();
			}

			cName = classNode.getNodeValue();
			// ͨ����������ʵ�����󲢽��䷵��
			Class c = Class.forName(cName);
			Object obj = c.newInstance();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}