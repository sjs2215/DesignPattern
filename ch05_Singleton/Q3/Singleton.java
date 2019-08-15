package ch05.Q3;

public class Singleton {
	private static Singleton singleton = null;

	private Singleton() {
		System.out.println("�ν��Ͻ��� �����߽��ϴ�.");
	}

	public static Singleton getInstance() {
		// ��ü�� �������� �ʾ��� ��쿡��...
		if (singleton == null) {
			singleton = new Singleton();  // ���� ��ü�� �����.
		}
		return singleton;
	}
}
