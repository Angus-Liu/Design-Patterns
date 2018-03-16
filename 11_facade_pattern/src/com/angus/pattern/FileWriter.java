package com.angus.pattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
 * @author GuangSIR 
 * @date 2018��3��16�� ����4:49:40 
 * @version 1.0 
 */
// FileWriter���ļ������࣬�䵱��ϵͳ��
public class FileWriter {
	public void write(String encryptStr, String fileNameDes) {
		System.out.print("�������ģ�д���ļ���");
		FileOutputStream fos = null;
		try {
			File file = new File(fileNameDes);
			System.out.println(file.getAbsolutePath());
			fos = new FileOutputStream(file);
			
			byte[] str = encryptStr.getBytes();
			try {
				fos.write(str, 0, str.length);
				fos.flush();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
