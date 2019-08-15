package ch17.Sample;

// Observer �������̽��� ������ ��ü���� ������
public class GraphObserver implements Observer {
	// ������ ���� �������� �׷������� ǥ����
	public void update(NumberGenerator generator) {
		System.out.print("GraphObserver:");
		int count = generator.getNumber();
		// count ��ŭ ��ǥ�� ����Ѵ�.
		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println("");
		try {
			Thread.sleep(100); // (100/1000 = 0.1 ��) ���� CPU�� ��ȯ�ϰ� ���ڴٴ� ��
		} catch (InterruptedException e) {
		}
	}
}
