package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��14�� ����8:26:35 
 * @version 1.0 
 */
// ���ݿ���־��¼�������ࣺ���幤��
class DatabaseLoggerFactory implements LoggerFactory {
	public Logger createLogger() {
		// �������ݿ⣬����ʡ��
		// �������ݿ���־��¼������
		Logger logger = new DatabaseLogger();
		// ��ʼ�����ݿ���־��¼��������ʡ��
		return logger;
	}
}