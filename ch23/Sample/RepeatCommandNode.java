package ch23.Sample;

// <repeat command> ::= repeat <number> <command list>
// ���� <repeat command>�� ��Ÿ��.
// repeat 2 go left end
public class RepeatCommandNode extends Node {
	// <number> �κ��� �����
	private int number; 

	// <command list> �κ��� �����
	private Node commandListNode;

	public void parse(Context context) throws ParseException {
		context.skipToken("repeat"); // ���� toke�� "repeat"�̸�, ���� ��ū���� �����Ų��.
		number = context.currentNumber(); // ���� ��ū�� ���ڷ� ���´�.
		context.nextToken(); // ���� ��ū���� �̵���Ų ����,
		commandListNode = new CommandListNode(); // CommandListNode ��ü���� parse�� ��Ź�Ѵ�.
		commandListNode.parse(context);
	}

	public String toString() {
		return "[repeat " + number + " " + commandListNode + "]";
	}
}
