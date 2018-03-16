package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018年3月16日 下午4:54:01 
 * @version 1.0 
 */
// EncryptFacade：加密外观类，充当外观类
public class EncryptFacade {
	// 维持对其他对象的引用
	private FileReader reader;
	private CipherMachine cipher;
	private FileWriter writer;

	public EncryptFacade() {
		reader = new FileReader();
		cipher = new CipherMachine();
		writer = new FileWriter();
	}
	
	public void FileEncrypt(String fileNameSrc, String fileNameDes){
		String plainSrc = reader.read(fileNameSrc);
		String encryptStr = cipher.encrypt(plainSrc);
		writer.write(encryptStr, fileNameDes);
	}

}
