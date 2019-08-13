package ch16.Sample;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {
	private Mediator mediator;

	public ColleagueButton(String caption) {
		super(caption);
	}

	// �Է� ���ڷ� ���� Mediator�� ��� ������ mediator�� �Ҵ���
	public void setMediator(Mediator mediator) { 
		this.mediator = mediator;
	}

	// Button Ŭ�������� �������� setEnabled(boolean)�� ȣ���Ͽ� ��ȿ/��ȿ�� �����Ѵ�.
	public void setColleagueEnabled(boolean enabled) { 
		setEnabled(enabled); // setEnabled( )�� �θ��� Button Ŭ�����κ��� �������� �޼ҵ��̴�.
	}
}
