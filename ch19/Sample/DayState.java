package ch19.Sample;

// �ְ��� ���¸� ��Ÿ���� Ŭ����
public class DayState implements State {
	// �ϳ��� ���¸� �ʿ��ϹǷ�, Singleton ������ �����
	private static DayState singleton = new DayState();

	private DayState() { // �����ڴ� private
	}

	public static State getInstance() { // ������ �ϳ��� �ν��Ͻ��� ��´�.
		return singleton;
	}

	// �ð��� �����ϴ� �޼ҵ�
	public void doClock(Context context, int hour) { 
		// ���ڿ��� ������ �ð��� �߰��� �ð��̸�, 
		if (hour < 9 || 17 <= hour) {
			context.changeState(NightState.getInstance()); // �ý����� ���¸� �߰����� �ٲ۴�.
		}
	}

// ���ְ� ���¡����� �ϴ� ���� ǥ���ϴ� �޼ҵ�

	// �ݰ� ����� ��Ÿ���� �޼ҵ�
	public void doUse(Context context) { 
		context.recordLog("�ݰ���(�ְ�)"); // �ְ��� �ݰ� ��������� ���
	}

	// ��󺧷� ����͸� ȣ���ϴ� �޼ҵ�
	public void doAlarm(Context context) { // ���
		context.callSecurityCenter("���(�ְ�)");
	}

	// ����Ϳ� �Ϲ���ȭ�� ��
	public void doPhone(Context context) { 
		context.callSecurityCenter("�Ϲ� ��ȭ(�ְ�)");
	}

	public String toString() { // ���ڿ� ǥ��
		return "[�ְ�]";
	}
}
