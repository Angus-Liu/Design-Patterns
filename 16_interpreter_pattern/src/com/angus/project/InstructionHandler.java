package com.angus.project;

import java.util.Stack;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����4:11:03 
 * @version 1.0 
 */
// ָ����ࣺ������
public class InstructionHandler {
	private AbstractNode node;

	public void handle(String instruction) {
		AbstractNode left = null;
		AbstractNode right = null;

		AbstractNode direction = null;
		AbstractNode action = null;
		AbstractNode distance = null;

		// ����һ��ջ�������ڴ洢�����﷨��
		Stack<AbstractNode> stack = new Stack<>();

		// �Կո���Ϊָ��ָ��
		String[] words = instruction.split(" ");

		// System.out.println(Arrays.asList(words));

		// ��ʵ������ջ�ķ�ʽ������ָ����������and����
		// ����������������Ϊ�����ս������ʽ����һ
		// ���򵥾���SentenceNode��Ϊ��and�����ұ���ʽ��
		// ������ջ�������ı���ʽ��Ϊ��and���������ʽ��
		// ����µġ�and������ʽѹ��ջ�С�
		for (int i = 0; i < words.length; i++) {
			if (words[i].equalsIgnoreCase("and")) {
				left = stack.pop(); // ����ջ������ʽ��Ϊ�����ʽ
				// ��ȡ�ұ���ʽԪ��
				String word1 = words[++i];
				direction = new DirectionNode(word1);
				String word2 = words[++i];
				action = new ActionNode(word2);
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				// �����ұ���ʽ
				right = new SentenceNode(direction, action, distance);
				// ���±�ʾѹ��ջ��
				stack.push(new AndNode(left, right));
			} else {
				// ����Ǵ�ͷ��ʼ���н��ͣ���ǰ3������
				// ���һ���򵥾���SentenceNode�������Ӹþ���ѹ��ջ��
				String word1 = words[i];
				direction = new DirectionNode(word1);
				String word2 = words[++i];
				action = new ActionNode(word2);
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				left = new SentenceNode(direction, action, distance);
				// ���±���ʽѹ��ջ��
				stack.push(left);
			}
		}
		this.node = stack.pop();
	}

	public String output() {
		// ���ͱ���ʽ
		String result = node.interpret();
		return result;
	}
}