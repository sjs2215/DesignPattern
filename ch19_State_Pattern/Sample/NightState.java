package ch19.Sample;

// �߰��� ���¸� ��Ÿ���� Ŭ����
public class NightState implements State {
	private static NightState singleton = new NightState();

	private NightState() { // �����ڴ� private
	}

	public static State getInstance() { // ������ �ϳ��� �ν��Ͻ��� ��´�.
		return singleton;
	}

	public void doClock(Context context, int hour) { // �ð�����
		// ���ڿ��� ������ �ð��� �ְ��� �ð��̸�, 
		if (9 <= hour && hour < 17) {
			context.changeState(DayState.getInstance()); // �ý����� ���¸� �ְ����� �ٲ۴�.
		}
	}

	public void doUse(Context context) { // �ݰ���
		context.callSecurityCenter("���:�߰��� �ݰ���");
	}

	public void doAlarm(Context context) { // ���
		context.callSecurityCenter("���(�߰�)");
	}

	public void doPhone(Context context) { // �Ϲ� ��ȭ
		context.recordLog("�߰��� ��ȭ ����");
	}

	public String toString() { // ���ڿ� ǥ��
		return "[�߰�]";
	}
}
