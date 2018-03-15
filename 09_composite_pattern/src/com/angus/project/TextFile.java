package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 下午8:16:44 
 * @version 1.0 
 */
// 文本文件类：叶子构件
public class TextFile extends AbstractFile {
	private String name;

	public TextFile(String name) {
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		System.out.println("叶子节点，不支持该方法！");
	}

	@Override
	public void remove(AbstractFile file) {
		System.out.println("叶子节点，不支持该方法！");
	}

	@Override
	public AbstractFile getChild(int i) {
		System.out.println("叶子节点，不支持该方法！");
		return null;
	}

	@Override
	public void killVirus() {
		// 模拟杀毒
		System.out.println("------对文本文件'" + name + "'进行杀毒------");
	}

}
