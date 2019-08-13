package ch16.Sample;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// ������ ������ �ϴ� Ŭ����
public class LoginFrame extends Frame implements ActionListener, Mediator {
	private ColleagueCheckbox checkGuest;

	private ColleagueCheckbox checkLogin;

	private ColleagueTextField textUser;

	private ColleagueTextField textPass;

	private ColleagueButton buttonOk;

	private ColleagueButton buttonCancel;

	// ������
	// Colleague���� �����ؼ� ��ġ�� �Ŀ� ǥ�ø� �����Ѵ�.
	public LoginFrame(String title) {
		super(title);
		// ������ ����(setBackground( ) �̿�)
		setBackground(Color.lightGray);
		// ���̾ƿ� �Ŵ���: �������� �����ϴ� ���� ����� ��ġ�� �����Ѵ�.
		// �׸��� ���̾ƿ� �Ŵ����� ����ؼ� 4*2�� �׸��带 �����.
		// ��, ������ ������ 4�� 2���� ����
		setLayout(new GridLayout(4, 2));
		
		// Colleague���� ����
		createColleagues();
		
		// ������ Colleague���� ��ġ
		add(checkGuest);
		add(checkLogin);
		add(new Label("Username:"));
		add(textUser);
		add(new Label("Password:"));
		add(textPass);
		add(buttonOk);
		add(buttonCancel);
		
		// �� üũ�ڽ� ��ȿ/��ȿ�� �ʱ�ȭ�Ѵ�.
		colleagueChanged(checkGuest);
		
		// ǥ��
		pack(); // ���Ե� ������Ʈ���� ���̾ƿ�(��ġ ����)�� �°� ������ ũ�⸦ �����Ѵ�.
		show(); // �����츦 �����ش�.
	}

	// Colleague���� �����Ѵ�.
	public void createColleagues() {
		// ����
		// Checkbox ���� 
		CheckboxGroup g = new CheckboxGroup();
		checkGuest = new ColleagueCheckbox("Guest", g, true);
		checkLogin = new ColleagueCheckbox("Login", g, false);
		
		textUser = new ColleagueTextField("", 10);
		textPass = new ColleagueTextField("", 10);
		textPass.setEchoChar('*');
		buttonOk = new ColleagueButton("OK");
		buttonCancel = new ColleagueButton("Cancel");
		
		// Mediator�� �����Ѵ�. �� GUI ������Ʈ�� �����ڴ� ���� Ŭ���� �ڽ��̴�.
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		buttonOk.setMediator(this);
		buttonCancel.setMediator(this);
		
		// Listener���� �����Ѵ�.
		checkGuest.addItemListener(checkGuest); // �ڽ��� �̺�Ʈ �����ʰ� �ȴ�
		checkLogin.addItemListener(checkLogin); // �ڽ��� �̺�Ʈ �����ʰ� �ȴ�
		textUser.addTextListener(textUser); // �ڽ��� �̺�Ʈ �����ʰ� �ȴ�
		textPass.addTextListener(textPass); // �ڽ��� �̺�Ʈ �����ʰ� �ȴ�
		buttonOk.addActionListener(this);
		buttonCancel.addActionListener(this);
	}

	// colleague�� ���°� ��ȭ���� ��, ȣ��Ǵ� �޼ҵ�
	// Colleague�κ����� ������ ����, ������ ������ �ľ��Ͽ� �� Colleague�� ��ȿ/��ȿ�� �����Ѵ�.
	// colleague�� ���� ��ȭ�� ���� �ش� colleague�� ���¸� 
	// ��� ��ȭ��ų ���ΰ��� ���� ������ ������ �ִ�.
	public void colleagueChanged(Colleague c) {
		// ���º�ȭ�� �߻��� ���� checkGuest�� checkLogin�̸�...
		if (c == checkGuest || c == checkLogin) {
			if (checkGuest.getState()) { // checkGuest�� üũ�Ǿ��ٸ�...
				textUser.setColleagueEnabled(false);
				textPass.setColleagueEnabled(false);
				buttonOk.setColleagueEnabled(true);
			} else { // checkLogin�� üũ�Ǿ��ٸ�...
				textUser.setColleagueEnabled(true);
				userpassChanged();  // user name �̳� password �ؽ�Ʈ�ʵ尡 �ٲ� ���̹Ƿ�...
			}
		}
		// ���º�ȭ�� �߻��� ���� textUser�� textPass�̸�...
		else if (c == textUser || c == textPass) {
			userpassChanged();
		} else {
			System.out.println("colleagueChanged:unknown colleague = " + c);
		}
	}

	// TextField ���� ��ȭ�� ���� ��ư Ȱ��ȭ/��Ȱ��ȭ�Ѵ�.
	private void userpassChanged() {
		if (textUser.getText().length() > 0) { // textUser�� ���� �� �ִٸ�...
			textPass.setColleagueEnabled(true); // textPass�� ��ȿȭ ��Ų��.
			if (textPass.getText().length() > 0) { // textPass�� ���� �� �ִٸ�...
				buttonOk.setColleagueEnabled(true); // buttonOk�� ��ȿȭ��Ų��.
			} else {
				buttonOk.setColleagueEnabled(false); // textPass�� ���� �� ���� �ʴٸ�...
			}
		} else { // textUser�� ���� �� ���� �ʴٸ�... textPass�� buttonOk�� ��ȿȭ��Ų��.
			textPass.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(false);
		}
	}

	// OK, Cancel ��ư�� �������� �� ����Ǵ� �޼ҵ�
	public void actionPerformed(ActionEvent e) { // ��ư�� ��������
		System.out.println("" + e); // �߻��� �̺�Ʈ�� ���� ������ ȭ�鿡 ����ϰ�
		System.exit(0); // ���α׷��� �����Ѵ�.
	}
}
