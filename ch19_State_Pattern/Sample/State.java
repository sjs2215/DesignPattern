package ch19.Sample;

// �ݰ��� ���¸� ��Ÿ��
public interface State {
	// �� �޼ҵ��� ���� ���ڴ� Context
	// Context Ŭ����: ���¸� �����ϰų� ���� ����͸� ȣ���ϴ� ���� �ϴ� Ŭ����
	
	public abstract void doClock(Context context, int hour); // �ð� ����

	public abstract void doUse(Context context); // �ݰ���

	public abstract void doAlarm(Context context); // ���

	public abstract void doPhone(Context context); // �Ϲ���ȭ
}
