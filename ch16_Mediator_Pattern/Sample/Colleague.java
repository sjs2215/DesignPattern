package ch16.Sample;

//��ī��������� ����Ϸ� ���� ����� ��Ÿ���� �������̽�
public interface Colleague {
	// ������ ���� �޼ҵ�
	// Mediator �������̽��� ������ LoginFrame Ŭ������ ù��°�� ȣ���ϴ� �޼ҵ�
	// ������ ī����ϱ� ����صμ��䡱��� �ǹ�
	public abstract void setMediator(Mediator mediator);

	// ��ī����� ������ ���á��� �ش���
	// ����� ���¸� ����ȿ�� �Ǵ� ����ȿ���� �ٲٴ� ���� �����Ѵ�.
	public abstract void setColleagueEnabled(boolean enabled);
}
