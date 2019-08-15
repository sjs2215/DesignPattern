package ch10.A1;

public class Hand {
    public static final int HANDVALUE_GUU = 0;  // �ָ��� ��Ÿ���� ��
    public static final int HANDVALUE_CHO = 1;  // ������ ��Ÿ���� ��
    public static final int HANDVALUE_PAA = 2;  // ���� ��Ÿ���� ��
    public static final Hand[] hand = {         // ������������ ���� ��Ÿ���� 3���� �ν��Ͻ�
        new Hand(HANDVALUE_GUU),
        new Hand(HANDVALUE_CHO),
        new Hand(HANDVALUE_PAA),
    };
    private static final String[] name = {      // ������������ ���� ���ڿ� ǥ��
        "�ָ�", "����", "��",
    };
    private int handvalue;                      // ������������ ���� ��
    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }
    public static Hand getHand(int handvalue) { // �����κ��� �ν��Ͻ��� ��´�.
        return hand[handvalue];
    }
    public boolean isStrongerThan(Hand h) {     // this�� h���� ���� ��true
        return fight(h) == 1;
    }
    public boolean isWeakerThan(Hand h) {       // this�� h���� ���� ��true
        return fight(h) == -1;
    }
    private int fight(Hand h) {                 // ���ºδ� 0, this�� �̱��1, h�� �̱�� -1
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }
    public String toString() {                  // ���ڿ� ǥ������ ��ȯ
        return name[handvalue];
    }
}
