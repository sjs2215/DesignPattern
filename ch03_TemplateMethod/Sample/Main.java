package ch03.Sample;

public class Main {
	public static void main(String[] args) {
		
		// 'H'�� ���� CharDisplay�� �ν��Ͻ��� 1�� �����.
		AbstractDisplay d1 = new CharDisplay('H');
		
		// "Hello, world."�� ���� StringDisplay�� �ν��Ͻ��� 1�� �����.
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		
		// "�ȳ��ϼ���"�� ���� StringDisplay�� �ν��Ͻ��� 1�� �����.
		AbstractDisplay d3 = new StringDisplay("�ȳ��ϼ���.");

		// d1,d2,d3��� ���� AbstractDisplay�� ���� Ŭ������ �ν��Ͻ��̱� ������
		// ����� display�޼ҵ带 ȣ���� �� �ִ�.
		// ������ ������ �� ���� Ŭ���� CharDisplay�� StringDisplay���� ���Ѵ�.
		d1.display();
		d2.display();
		d3.display();
	}
}
