package ch14.Sample;

public class Trouble {
	private int number; // Ʈ���� ��ȣ�� ������

	// Ʈ������ ������
	public Trouble(int number) {
		this.number = number;
	}

	// Ʈ���� ��ȣ�� ��ȯ�ϴ� �޼ҵ�
	public int getNumber() {
		return number;
	}

	public String toString() { // Ʈ������ ���ڿ� ǥ��
		return "[Trouble " + number + "]";
	}
}
