package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����8:35:41 
 * @version 1.0 
 */
// �������ӱ���¼�ࣺ����¼
public class ChessmanMemento {
	private String label;
	private int x;
	private int y;

	public ChessmanMemento(String label, int x, int y) {
		super();
		this.label = label;
		this.x = x;
		this.y = y;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
