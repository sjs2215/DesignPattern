package ch23.Sample;

// <command> ::= <repeat command> | <primitive command> ���� <command>�� ��Ÿ��
public class CommandNode extends Node {
	// RepeatCommandNode �Ǵ� PrimitiveCommandNode�� �ν��Ͻ��� �־�δ� ����
	private Node node;

	public void parse(Context context) throws ParseException {
		
		if (context.currentToken().equals("repeat")) { // "repeat" �� ���۵Ǹ�...
			node = new RepeatCommandNode(); // RepeatCommandNode �ν��Ͻ��� ������ �� 
			node.parse(context); // �װ��� parse( )�� ȣ���Ѵ�.
		} else { // "repeat"�� �������� ������...
			node = new PrimitiveCommandNode(); // PrimitiveCommandNode �ν��Ͻ��� ������ ��
			node.parse(context); // �װ��� parse( )�� ȣ���Ѵ�.
		}
	}

	public String toString() {
		return node.toString();
	}
}
