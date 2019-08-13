package ch17.Sample;

import java.util.Random;

// NumberGenerator�� ���� Ŭ����
public class RandomNumberGenerator extends NumberGenerator {
	// java.util.Random Ŭ���� �̿�
	private Random random = new Random(); // �����߻���

	private int number; // ������ ������ �����ϴ� ����

	public int getNumber() { // ���� ����Ѵ�.
		return number; // number �ʵ��� ���� ��ȯ��
	}

	// 0~49 ������ ���� 20���� �����ϰ�, 
	// �� ������ notifyObservers�� ȣ���Ͽ�, 
	// �����ڵ鿡�� �����Ѵ�.
	public void execute() {
		for (int i = 0; i < 20; i++) {
			number = random.nextInt(50);
			notifyObservers(); // �����ڿ��� �����϶�� ��û�Ѵ�.
		}
	}
}
