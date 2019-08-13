package ch05.A3_1;

public class Singleton {
	private static Singleton singleton = null;

	private Singleton() {
		System.out.println("�ν��Ͻ��� �����߽��ϴ�.");
		slowdown();  // ���� �� 1�ʰ� ����.        
	}

	//synchronized public static Singleton getInstance() {
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	private void slowdown() {
		try {
			Thread.sleep(1000);  // �� �޼ҵ带 ȣ���� ������� 1000 �и���, �� 1�ʰ� CPU�� ������ ����.    
		} catch (InterruptedException e) {
		}
	}
}