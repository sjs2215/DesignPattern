package ch17.Sample;

public class Main {
	public static void main(String[] args) {
		// RandomNumberGenerator �ν��Ͻ� 1 �� ������
		NumberGenerator generator = new RandomNumberGenerator();
		
		// ������ 2�� ������
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		
		// RandomNumberGenerator�� ������ 2���� �����
		generator.addObserver(observer1);
		generator.addObserver(observer2);
		
		// RandomNumberGenerator�� execute( )�� �̿��ؼ� ���� �����Ѵ�
		generator.execute();
		// ������ �߻��� ������, �����ڵ��� ������ ��Ĵ�� ���� ��ǥ�á��Ѵ�.
	}
}
