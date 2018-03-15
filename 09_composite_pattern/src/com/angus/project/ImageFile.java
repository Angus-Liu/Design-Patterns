package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 下午8:12:29 
 * @version 1.0 
 */
// 图像文件类：叶子构件
public class ImageFile extends AbstractFile {

	private String name;
	
	public ImageFile(String name) {
		this.name = name;
	}
	
	@Override
	public void add(AbstractFile file) {
		System.out.println("叶子节点，不支持此方法！");
	}

	@Override
	public void remove(AbstractFile file) {
		System.out.println("叶子节点，不支持此方法！");
	}

	@Override
	public AbstractFile getChild(int i) {
		System.out.println("叶子节点，不支持此方法！");
		return null;
	}

	@Override
	public void killVirus() {
		// 模拟杀毒
		System.out.println("------对图像文件'" + name + "'进行杀毒------");
	}

}
