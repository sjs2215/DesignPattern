package ch05.Sample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");

		// Singleton ��ü�� �� �� ���´�.
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

		// �� ���� Singleton ��ü�� �ּҰ� ������ ���Ѵ�.
        if (obj1 == obj2) {
            System.out.println("obj1�� obj2�� ���� �ν��Ͻ��Դϴ�.");
        } else {
            System.out.println("obj1�� obj2�� ���� �ν��Ͻ��Դϴ�.");
        }
        System.out.println("End.");
    }
}
