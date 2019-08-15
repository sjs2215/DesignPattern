package ch05.A1;

public class TicketMaker {
	private int ticket = 1000;

	private static TicketMaker singleton = new TicketMaker();

	private TicketMaker() {
	}

	public static TicketMaker getInstance() {
		return singleton;
	}

	// �� �����尡 �� �޼ҵ带 ȣ���ؼ� �����ϴ� ����
	// �ٸ� �����尡 �� �޼ҵ带 ȣ���ϴ� ���,
	// �� �����尡 ��� ���� ���� ��ȯ�޴� ��찡 �߻��� �� �ִ�.
	// ��? 
	// ������ ���� ��찡 �߻��� �� �ִ�.
	// ticket�� ���� ���� 10�̶�� ����.
	// ������ A�� �� �޼ҵ带 ȣ�� �� ���� ��  ticket ���� �����ͼ� 1 �ø�������,
	// CPU�� �ٸ� ������(B)���� �Ҵ�Ǿ� �� �޼ҵ尡 ����ȴٰ� ����.
	// ������ B�κ��� ȣ��� �޼ҵ� ������ ���� �����ٸ�,
	// ������ B�� 11�� ��ȯ������ ��������.
	// �� �� ������ A�� ������ �κ��� �����ϸ� �Ȱ��� 11�� ��ȯ������ ��������.
	public synchronized int getNextTicketNumber() {
		return ticket++; // 3���� job���� ������: ticket ���� ��������, 1 ���ϰ�, �ٽ� ticket �� ����.
	}
}
