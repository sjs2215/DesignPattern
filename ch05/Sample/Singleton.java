package ch05.Sample;

public class Singleton {
	// Singleton ��ü �ϳ��� �����ؼ� ����Ű�� ���� �ʵ�
	// Ŭ������ �޸𸮿� �ε�� �� �ѹ� �����
	private static Singleton singleton = new Singleton();

	// ������
	private Singleton() {
		System.out.println("�ν��Ͻ��� �����߽��ϴ�.");
	}

	// singleton ���� �ʵ尡 ����Ű�� Singleton ��ü�� ��ȯ��
	public static Singleton getInstance() {
		System.out.println("�ν��Ͻ��� ��ȯ�մϴ�.");
		return singleton;
	}
}
