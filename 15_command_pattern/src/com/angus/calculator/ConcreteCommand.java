package com.angus.calculator;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����11:18:19 
 * @version 1.0 
 */

// ����������
public class ConcreteCommand extends AbstractCommand {
	private Adder adder = new Adder();
	private int value;
	private List<Integer> values = new ArrayList<>();
	private int index;

	// ʵ�ֳ�������������execute()���������üӷ���ļӷ�����
	@Override
	public int execute(int value) {
		this.value = value;
		index++;
		values.add(value);
		return adder.add(value);
	}

	// ʵ�ֳ�����������������undo()������ͨ������һ���෴����ʵ�ּӷ����������
	@Override
	public int undo() {
		if (index - 1 >= 0) {
			index--;
			int undoValue = values.get(index);
			return adder.add(-undoValue);
		} else {
			return adder.add(0);
		}
	}

	// ʵ�ֳ�����������������redo()�������ָ�����
	@Override
	public int redo() {
		if (index + 1 <= values.size()) {
			int redoValue = values.get(index);
			index++;
			return adder.add(redoValue);
		} else {
			return adder.add(0);
		}
	}

}
