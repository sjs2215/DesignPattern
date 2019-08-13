package ch23.Sample;

// <program> ::= program <command list> ���� <program>�� ��Ÿ��
// ��: program repeat 2 go left end go end
public class ProgramNode extends Node {
	// �ڽ��� �ڿ� �̾����� <command list>�� �����ϴ� ����(���)�� ������
	private Node commandListNode;

	public void parse(Context context) throws ParseException {
		// ���� ��ū�� "program"���� Ȯ���Ѵ�.
		context.skipToken("program");
		// ������ �κ���, CommandListNode���� parse�� ��Ź�Ѵ�.
		commandListNode = new CommandListNode();
		commandListNode.parse(context);
	}

	public String toString() {
		// commandListNode�� toString( )�� �ڵ����� ȣ��ȴ�.
		return "[program " + commandListNode + "]";
	}
}
