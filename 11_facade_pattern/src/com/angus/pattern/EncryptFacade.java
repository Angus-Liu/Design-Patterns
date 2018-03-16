package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018��3��16�� ����4:54:01 
 * @version 1.0 
 */
// EncryptFacade����������࣬�䵱�����
public class EncryptFacade {
	// ά�ֶ��������������
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
