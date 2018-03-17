package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018年3月16日 下午9:28:03 
 * @version 1.0 
 */
// 代理查询类：代理主题类
public class ProxySearcher implements Searcher {

	// 维持一个对真实主题的引用
	private RealSearcher searcher = new RealSearcher();

	// 新增业务类
	private AccessValidator validator;
	private Logger logger;

	@Override
	public String doSearch(String userId, String keyword) {
		// 如果身份验证成功，则执行查询
		if (validate(userId)) {
			// 调用真实主题对象的查询方法
			String reult = searcher.doSearch(userId, keyword);
			// 记录查询日志
			log(userId);
			return reult;
		}
		return null;
	}

	// 创建访问验证对象并调用其validate()方法实现身份验证
	public boolean validate(String userId) {
		validator = new AccessValidator();
		return validator.validate(userId);
	}

	// 创建日志记录对象并调用其log()方法是实现日志记录
	public void log(String userId) {
		logger = new Logger();
		logger.log(userId);
	}

}
