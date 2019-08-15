package ch17.Sample;

// Observer �������̽��� ������ ��ü���� ������
public class DigitObserver implements Observer {
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver:" + generator.getNumber()); // ������ ���� �����ڡ��� ǥ����
		try {
			// ����� ��, ǥ�õ� ����� �� �� �� �ֵ��� 
			// Thread.sleep( )�� �̿��Ͽ� ���ǵ带 �����.
			Thread.sleep(100); // (100/1000 = 0.1 ��) ���� CPU�� ��ȯ�ϰ� ���ڴٴ� ��
		} catch (InterruptedException e) {
		}
	}
}
