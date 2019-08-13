package ch16.Sample;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ColleagueCheckbox extends Checkbox implements ItemListener,
		Colleague {
	private Mediator mediator;

	public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) { // ������
		super(caption, group, state);
	}

	public void setMediator(Mediator mediator) { // Mediator�� ����
		this.mediator = mediator;
	}

	// ��ī����� ������ ���á��� �ش���
	public void setColleagueEnabled(boolean enabled) { 
		setEnabled(enabled);
	}

	// ������ư�� ���°� �ٲ���� ��, ItemEvent�� �߻��ǰ�, 
	// ��ϵ� ItemListener�� �� �޼ҵ尡 �ڵ����� ȣ��ȴ�.
	public void itemStateChanged(ItemEvent e) {
		mediator.colleagueChanged(this);  // ���°� ���ϸ� Mediator���� �����Ѵ�.
	}
}
