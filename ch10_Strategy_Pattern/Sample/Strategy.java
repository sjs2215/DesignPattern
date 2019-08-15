package ch10.Sample;

public interface Strategy {
	//������ ���� ���� ��� ���� ȣ���ϴ� �޼ҵ�
	// �� �޼ҵ尡 ȣ��Ǹ�, 
	// Strategy �������̽��� ������ Ŭ������ ������ ��� ������ �ա��� ������
	public abstract Hand nextHand(); // ������ ���� ���� �˷��ش�.

	// ���� �ºο� ���� ������ �غ��Ű�� �޼ҵ�
	// �̱� ��쿡�� Player�� study(true)�� ȣ���ϰ�, 
	// �� ��쿡�� Player�� study(false)�� ȣ���Ѵ�.
	public abstract void study(boolean win);
}
