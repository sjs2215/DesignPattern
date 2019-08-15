package ch22.Sample.command;

import java.util.Stack;
import java.util.Iterator;

// ������ ���� ����� �ѵ� ���� ��ɡ��� ��Ÿ��
// Composite ������ ����
// => ���� ���� ����� ���� ��(container)�̸鼭, 
// �� ��ü�� �ϳ��� ���(content)�� �ȴ�.
public class MacroCommand implements Command {
	// �ټ��� Command�� ��Ƶ�
	// Stack: ���߿� �� ���Ұ� ���� ������ �ڷᱸ��ü
	private Stack commands = new Stack();

	// ����
	public void execute() {
		// �ڽ��� ������ �ִ� ��� ����� execute( )�� ȣ���Ѵ�(�����Ѵ�)
		Iterator it = commands.iterator();
		while (it.hasNext()) {
			((Command) it.next()).execute();
		}
		// �ڽ��� ������ �ִ� ����� MacroCommand�̸�, 
		// �� MacroCommand�� ������ �ִ� ��ɵ��� execute( )�� ���ʴ�� ����ȴ�.
		// (recursive call)

	}

	// MacroCommand Ŭ������ 
	// ���ο� Command(Command �������̽��� ������ Ŭ������ �ν��Ͻ�)�� 
	// �߰��ϴ� �޼ҵ�
	public void append(Command cmd) {
		// �Ǽ��� �ڱ� �ڽ��� �߰����� �ʵ��� üũ��
		// �ڱ� �ڽ��� �߰��Ǹ�, execute( ) ���� �� ���� ������ ���� �ȴ�.
		if (cmd != this) {
			commands.push(cmd); // Stack Ŭ������ push( )�� �̿���
		}
	}

	// commands�� ������ ����� �����ϴ� �޼ҵ�
	public void undo() {
		if (!commands.empty()) {
			commands.pop();
		}
	}

	// commands �� ��� ����� �����ϴ� �޼ҵ�
	public void clear() {
		commands.clear();
	}
}
