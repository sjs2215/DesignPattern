package ch16.Sample;

import java.awt.TextField;
import java.awt.Color;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

// java.awt.event.TextListener �������̽��� ������
// �ؽ�Ʈ �ʵ��� ������ �ٲ���� ��, TextEvent�� ó���ϴ� textValueChanged �޼ҵ带 �����Ѵ�.
public class ColleagueTextField extends TextField implements TextListener, Colleague {
	private Mediator mediator;

	public ColleagueTextField(String text, int columns) { // ������
		super(text, columns);
	}

	// �Է� ���ڷ� ���� Mediator�� ��� ������ mediator�� �Ҵ���
	public void setMediator(Mediator mediator) { 
		this.mediator = mediator;
	}

	// TextFiled Ŭ�������� �������� setEnabled(boolean)�� ȣ���Ͽ� ��ȿ/��ȿ�� �����Ѵ�.
	public void setColleagueEnabled(boolean enabled) { 
		setEnabled(enabled);
		// enabled�� true�̸�, ������ �������, enabled�� false�̸� ������ ȸ������ ĥ�Ѵ�.
		// white, ligthGray: Color Ŭ������ ����Ǿ� �ִ� ���
		setBackground(enabled ? Color.white : Color.lightGray);
	}

	// TextListener �������̽��� ���ǵǾ� �ִ� �޼ҵ�
	// TextField�� ���� �ٲ� ������, TextEvent�� �߻��ǰ�, �� �޼ҵ尡 �ڵ����� ȣ��ȴ�.
	public void textValueChanged(TextEvent e) {
		mediator.colleagueChanged(this);  // ���ڿ��� ���ϸ� Mediator���� �����Ѵ�.
	}
}
