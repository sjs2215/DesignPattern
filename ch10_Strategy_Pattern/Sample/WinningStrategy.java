package ch10.Sample;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;  
    // ������ �ºο��� �̰����� true, ������ false ����
    private boolean won = false;
    private Hand prevHand; // ������ �ºο��� ���� �� ����

    public WinningStrategy(int seed) {
        random = new Random(seed);
	}

    public Hand nextHand() {
        if (!won) { // ������ ������
            prevHand = Hand.getHand(random.nextInt(3)); // ���ο� ���� ��´�
        }
        return prevHand; // �̰�����, ���� ���� �״�� ��ȯ�ȴ�.
    }

    public void study(boolean win) {
        won = win; // ������ �ºθ� ������
    }
}
