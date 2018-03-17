package com.angus.calculator;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 上午11:18:19 
 * @version 1.0 
 */

// 具体命令类
public class ConcreteCommand extends AbstractCommand {
	private Adder adder = new Adder();
	private int value;
	private List<Integer> values = new ArrayList<>();
	private int index;

	// 实现抽象类中声明的execute()方法，调用加法类的加法操作
	@Override
	public int execute(int value) {
		this.value = value;
		index++;
		values.add(value);
		return adder.add(value);
	}

	// 实现抽象命令类中声明的undo()方法，通过增加一个相反数来实现加法的逆向操作
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

	// 实现抽象命令类中声明的redo()方法，恢复撤销
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
