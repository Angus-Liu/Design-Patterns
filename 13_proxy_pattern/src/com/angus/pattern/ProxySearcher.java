package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018��3��16�� ����9:28:03 
 * @version 1.0 
 */
// �����ѯ�ࣺ����������
public class ProxySearcher implements Searcher {

	// ά��һ������ʵ���������
	private RealSearcher searcher = new RealSearcher();

	// ����ҵ����
	private AccessValidator validator;
	private Logger logger;

	@Override
	public String doSearch(String userId, String keyword) {
		// ��������֤�ɹ�����ִ�в�ѯ
		if (validate(userId)) {
			// ������ʵ�������Ĳ�ѯ����
			String reult = searcher.doSearch(userId, keyword);
			// ��¼��ѯ��־
			log(userId);
			return reult;
		}
		return null;
	}

	// ����������֤���󲢵�����validate()����ʵ�������֤
	public boolean validate(String userId) {
		validator = new AccessValidator();
		return validator.validate(userId);
	}

	// ������־��¼���󲢵�����log()������ʵ����־��¼
	public void log(String userId) {
		logger = new Logger();
		logger.log(userId);
	}

}
