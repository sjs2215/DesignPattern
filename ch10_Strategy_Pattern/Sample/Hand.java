package ch10.Sample;

// �ָ�, ����, �� 3 ������ �� �迭�� ������ ����.
// �� �� �� ���� ���� � ���������� �ش��ϴ� ���� �Ӽ����� ������.
public class Hand {
	public static final int HANDVALUE_GUU = 0; // �ָ��� ��Ÿ���� ��

	public static final int HANDVALUE_CHO = 1; // ������ ��Ÿ���� ��

	public static final int HANDVALUE_PAA = 2; // ���� ��Ÿ���� ��

	// hand�� ������������ ���� ��Ÿ���� 3���� �ν��Ͻ��� ������ �ִ� �迭
	public static final Hand[] hand = { new Hand(HANDVALUE_GUU),
			new Hand(HANDVALUE_CHO), new Hand(HANDVALUE_PAA), };

	private static final String[] name = { // ������������ ���� ���ڿ� ǥ��
	"�ָ�", "����", "��", };

	private int handvalue; // ������������ ���� ��

	private Hand(int handvalue) {
		this.handvalue = handvalue;
	}

	// �����κ��� Hand �ν��Ͻ��� ��´�.
	public static Hand getHand(int handvalue) {
		return hand[handvalue];
	}

	// this�� h���� ���� �� true�� ��ȯ��
	public boolean isStrongerThan(Hand h) { // this�� h���� ���� �� true
		return fight(h) == 1;
	}

	// this�� h���� ���� �� true�� ��ȯ��
	public boolean isWeakerThan(Hand h) { // this��h���� ���� �� true
		return fight(h) == -1;
	}

	// ���ºδ� 0, this�� �̱�� 1, h�� �̱�� -1�� ��ȯ��
	private int fight(Hand h) {
		if (this == h) {
			return 0;
		} else if ((this.handvalue + 1) % 3 == h.handvalue) { // ��: ���� ���� ����,
			// h�� ����+1(����)�̸�
			// ���� ���� �̱��.
			return 1;
		} else {
			return -1;
		}
	}

	// ���ڿ� ǥ������ ��ȯ
	public String toString() {
		return name[handvalue];
	}
}
