package com.angus.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/** 
 * @author GuangSIR 
 * @date 2018��3��14�� ����9:28:11 
 * @version 1.0 
 */
// ���ؾ�����LoadBalancer�������ࡣ
public class LoadBalancer {
	// ����������
	private List<String> serverList = null;
	
	private static class LoadBalancerHolder{
		private static final LoadBalancer instance = new LoadBalancer();
	}

	// ˽�й��캯��
	private LoadBalancer() {
		serverList = new ArrayList<String>();
	}

	// ���г�Ա����������Ψһʵ��
	public static LoadBalancer getLoadBalancer() {
		return LoadBalancerHolder.instance;
	}

	// ���ӷ�����
	public void addServer(String server) {
		serverList.add(server);
	}

	// ɾ��������
	public void removeServer(String server) {
		serverList.remove(server);
	}

	// ʹ��Random�������ȡ������
	public String getServer() {
		Random random = new Random();
		int i = random.nextInt(serverList.size());
		return serverList.get(i);
	}
}
