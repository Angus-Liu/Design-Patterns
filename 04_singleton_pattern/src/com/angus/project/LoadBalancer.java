package com.angus.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/** 
 * @author GuangSIR 
 * @date 2018年3月14日 下午9:28:11 
 * @version 1.0 
 */
// 负载均衡器LoadBalancer：单例类。
public class LoadBalancer {
	// 服务器集合
	private List<String> serverList = null;
	
	private static class LoadBalancerHolder{
		private static final LoadBalancer instance = new LoadBalancer();
	}

	// 私有构造函数
	private LoadBalancer() {
		serverList = new ArrayList<String>();
	}

	// 公有成员函数，返回唯一实例
	public static LoadBalancer getLoadBalancer() {
		return LoadBalancerHolder.instance;
	}

	// 增加服务器
	public void addServer(String server) {
		serverList.add(server);
	}

	// 删除服务器
	public void removeServer(String server) {
		serverList.remove(server);
	}

	// 使用Random类随机获取服务器
	public String getServer() {
		Random random = new Random();
		int i = random.nextInt(serverList.size());
		return serverList.get(i);
	}
}
