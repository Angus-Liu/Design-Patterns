package com.angus.project;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����9:18:27 
 * @version 1.0 
 */
// �������ô�����
public class FBSettingWindow {
	private String title; // ���ڱ���
	// ����һ��ArrayList���洢���й��ܼ�
	private List<FunctionButton> functionButtons = new ArrayList<>();

	public FBSettingWindow(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<FunctionButton> getFunctionButtons() {
		return functionButtons;
	}

	public void setFunctionButtons(List<FunctionButton> functionButtons) {
		this.functionButtons = functionButtons;
	}

	public void addFunctionButton(FunctionButton fb) {
		functionButtons.add(fb);
	}

	public void removeFunctionButtion(FunctionButton fb) {
		functionButtons.remove(fb);
	}

	// ��ʾ���ڼ����ܼ�
	public void display() {
		System.out.println("��ʾ���ڣ�" + this.title);
		System.out.println("��ʾ���ܼ���");
		for (FunctionButton fb : functionButtons) {
			System.out.println(fb.getName());
		}
		System.out.println("-------------------------------");
	}

}