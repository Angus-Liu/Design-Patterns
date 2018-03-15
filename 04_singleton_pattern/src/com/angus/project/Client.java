package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��14�� ����9:37:11 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		// �����ĸ�LoadBalancer����
		LoadBalancer balancer1, balancer2, balancer3, balancer4;
		balancer1 = LoadBalancer.getLoadBalancer();
		balancer2 = LoadBalancer.getLoadBalancer();
		balancer3 = LoadBalancer.getLoadBalancer();
		balancer4 = LoadBalancer.getLoadBalancer();

		// �жϷ��������ؾ������Ƿ���ͬ
		if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
			System.out.println("���ؾ���������Ψһ��");
		}
		
		// ���ӷ�����
		balancer1.addServer("Server 1");
		balancer2.addServer("Server 2");
		balancer3.addServer("Server 3");
		balancer4.addServer("Server 4");
		
		// ģ��ͻ�������ķַ�
		for(int i = 0; i < 10; i++){
			String server = balancer1.getServer();
			System.out.println("�ַ������������� --> " + server);
		}
	}
}
