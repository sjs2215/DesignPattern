package ch10.Sample;

import java.util.Random;

public class ProbStrategy implements Strategy {
	private Random random;

	// �������� �´� ��
	private int prevHandValue = 0;

	// �̹��� �´� ��
	private int currentHandValue = 0;

	private int[][] history = { { 1, 1, 1, }, { 1, 1, 1, }, { 1, 1, 1, } };

	public ProbStrategy(int seed) {
		random = new Random(seed);
	}

	// �� �޼ҵ� �ȿ� ������ �� �ִ�.
	public Hand nextHand() {
		// ���� ������ �̱� Ƚ���� ��� ������ �̰��� �̿��ؼ� ������ ���� ��´�.
		int bet = random.nextInt(getSum(currentHandValue));
		int handvalue = 0;

		if (bet < history[currentHandValue][0]) {
			handvalue = 0; // ����
		} else if (bet < history[currentHandValue][0]
				+ history[currentHandValue][1]) {
			handvalue = 1; // ����
		} else {
			handvalue = 2; // ��
		}
		prevHandValue = currentHandValue; // ���� ���� ���� ������ ��ġ��.
		currentHandValue = handvalue; // ���� ���� ���� ���� ������ ��ġ��.
		return Hand.getHand(handvalue);
	}

	// hv�� ���� �̰�� ��� Ƚ���� ��ȯ�Ѵ�.(2���� �迭���� hv ���� �� ���Ѵ�)
	private int getSum(int hv) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += history[hv][i];
		}
		return sum;
	}

	public void study(boolean win) {
		if (win) { // �̹��� �̰�����, �̹��� �´� �տ� 1�� ����
			history[prevHandValue][currentHandValue]++;
		} else { // �̹��� ������, �̹��� ���� �ʾҴ� �� �տ� 1�� ���Ѵ�.
			history[prevHandValue][(currentHandValue + 1) % 3]++;
			history[prevHandValue][(currentHandValue + 2) % 3]++;
		}
	}
}
