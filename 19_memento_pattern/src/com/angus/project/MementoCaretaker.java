package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午8:39:45 
 * @version 1.0 
 */
// 象棋棋子备忘录管理类：负责人
public class MementoCaretaker {
	private ChessmanMemento memento;

	public ChessmanMemento getMemento() {
		return memento;
	}

	public void setMemento(ChessmanMemento memento) {
		this.memento = memento;
	}

}
