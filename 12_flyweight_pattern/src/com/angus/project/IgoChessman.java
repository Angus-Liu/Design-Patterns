package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��16�� ����7:36:42 
 * @version 1.0 
 */
// Χ�������ࣺ������Ԫ��
public interface IgoChessman {
	public String getColor();

	default public void display(Coordinates coord) {
		System.out.println("������ɫ��" + this.getColor() + "������λ�ã�" + coord.getX() + "," + coord.getY());
	};
}
