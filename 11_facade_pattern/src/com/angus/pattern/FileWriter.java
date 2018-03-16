package com.angus.pattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
 * @author GuangSIR 
 * @date 2018年3月16日 下午4:49:40 
 * @version 1.0 
 */
// FileWriter：文件保存类，充当子系统类
public class FileWriter {
	public void write(String encryptStr, String fileNameDes) {
		System.out.print("保存密文，写入文件。");
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
