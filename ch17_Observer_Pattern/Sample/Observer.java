package ch17.Sample;

// �����ڸ� ǥ���ϴ� �������̽�
public interface Observer {
	// NumberGenerator�� ������ ������ ���ŵǾ����ϴ�. 
	// ǥ�õ� �������ּ��䡱 ��� �����ڿ��� �˷��� �� ȣ���ϴ� �޼ҵ�
	public abstract void update(NumberGenerator generator);
}
