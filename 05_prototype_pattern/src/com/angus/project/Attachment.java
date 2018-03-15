package com.angus.project;

import java.io.Serializable;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 上午9:11:38 
 * @version 1.0 
 */
public class Attachment implements Serializable{
	private String name; // 附件名

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void download() {
		System.out.println("下载附件，文件名为" + name);
	}
}
