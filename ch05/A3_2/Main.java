package ch05.A3_2;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start.");
		
		Singleton obj1 = Singleton.getInstance(); // �� �޼ҵ� ������ �� ���� �Ŀ���
		Singleton obj2 = Singleton.getInstance(); // �� �޼ҵ尡 ����ȴ�.
		
		if (obj1 == obj2) {
			System.out.println("obj1�� obj2�� ���� �ν��Ͻ��Դϴ�.");
		} else {
			System.out.println("obj1��obj2�� ���� �ν��Ͻ��� �ƴմϴ�.");
		}
		System.out.println("End.");
	}
}
