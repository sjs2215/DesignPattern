package ch23.Sample;

import java.util.Vector;

// <command list> ::= <command>* end ���� <command list>�� ��Ÿ��
// ��: repeat 2 go left end go end
public class CommandListNode extends Node {
	// 0�� �̻� �ݺ� �����ϴ� <command>�� ������
	// <command>�� �����ϴ� CommandNode Ŭ������ �ν��Ͻ��� �־��
	private Vector list = new Vector(); 

	public void parse(Context context) throws ParseException {
		// <Command> �� ���� �� ���� �� �����Ƿ�, while-loop�� ������.
		while (true) {
			if (context.currentToken() == null) { // ���� ��ū�� ���ٸ�(null)
				throw new ParseException("Missing 'end'"); // ��end���� �����ٴ� ���ܸ� �߻���Ŵ.
			} else if (context.currentToken().equals("end")) { // ���� ��ū�� ��end�����
				context.skipToken("end");  // ��end�� ���� ��ū���� �����Ų ��,  while ������ �������´�.
				break; 
			} else { // ���� ��ū�� ��end���� �ƴ϶�� => �� ���� <command>�� �ǹ��ϹǷ�, 
				Node commandNode = new CommandNode();  // CommandNode�� �ν��Ͻ��� ���� 
				commandNode.parse(context);  // �װ��� parse( )ȣ���� ��,
				list.add(commandNode); //  list�� �߰��Ѵ�.
			}
		}
	}

	public String toString() {
		return "" + list;
	}
}
