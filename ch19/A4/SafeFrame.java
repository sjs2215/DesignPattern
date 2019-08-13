import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock = new TextField(60);        // ����ð� ǥ��
    private TextArea textScreen = new TextArea(10, 60);     // ����� ���
    private Button buttonUse = new Button("�ݰ���");      // �ݰ��� ��ư
    private Button buttonAlarm = new Button("���");    // ��� ��ư
    private Button buttonPhone = new Button("�Ϲ� ��ȭ");    // �Ϲ� ��ȭ ��ư
    private Button buttonExit = new Button("����");         // ���� ��ư

    private State state = DayState.getInstance();           // ������ ����

    // ������
    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        // textClock�� ��ġ
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        // textScreen�� ��ġ
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);
        // �гο� ��ư�� ����
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        // �� �г��� ��ġ
        add(panel, BorderLayout.SOUTH);
        // ǥ��
        pack();
        show();
        // �������� ����
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }
    // ��ư�� �������� ����� �´�.
    public void actionPerformed(ActionEvent e) {
        System.out.println("" + e);
        if (e.getSource() == buttonUse) {           // �ݰ��� ��ư
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {  // ��� ��ư
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {  // �Ϲ� ��ȭ ��ư
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {   // ���� ��ư
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }
    // �ð��� ����
    public void setClock(int hour) {
        String clockstring = "���� �ð���";
        if (hour < 10) {
            clockstring += "0" + hour + ":00";
        } else {
            clockstring += hour + ":00";
        }
        System.out.println(clockstring);
        textClock.setText(clockstring);
        state.doClock(this, hour);
    }
    // ���º�ȭ
    public void changeState(State state) {
        System.out.println(this.state + "����" + state + "�� ���°� ��ȭ�߽��ϴ�.");
        this.state = state;
    }
    // ����� ȣ��
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }
    // ����� ���
    public void recordLog(String msg) {
        textScreen.append("record ... " + msg + "\n");
    }
}
