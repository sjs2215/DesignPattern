package ch03.Sample;

// StringDisplay�� AbstractDisplay�� ���� Ŭ����
public class StringDisplay extends AbstractDisplay {
	private String string; // ǥ���ؾ� �� ���ڿ��� �����ϴ� ����

	private int width; // ����Ʈ ������ ����� ���ڿ��� ��

	public StringDisplay(String string) { // �����ڿ��� �Ѿ�� ���ڿ� string��
		this.string = string; // �ʵ忡 ���
		
		// �׸��� ����Ʈ ������ ���� �ʵ忡 ����� �ΰ� ���߿� ����Ѵ�.
		this.width = string.getBytes().length;
		// System.out.println("string.getBytes().length = " + string.getBytes().length);

		// �Ʒ� ������ ���ڿ��� ������ ����Ѵ�.
		// System.out.println("string.length() = " + string.length());
	}

	public void open() { // �������̵��ؼ� ������ open�޼ҵ�
		printLine(); // �� Ŭ������ �޼ҵ� printLine���� ���� �׸��� �ִ�.
	}

	public void print() { // print�޼ҵ��
		// �ʵ忡 ����� �� ���ڿ��� ���Ŀ� "|"�� �ٿ��� ǥ��.
		System.out.println("|" + string + "|");
	}

	public void close() { // close�޼ҵ��
		// open�� ���� printLine�޼ҵ忡�� ���� �׸��� �ִ�.
		printLine();
	}

	// open�� close�κ��� ȣ��Ǵ� printLine�޼ҵ��.
	// private�̱� ������ �� Ŭ���� �������� ���ȴ�.
	private void printLine() {
		 // �簢Ʋ�� �����̸� ǥ���ϴ� "+"��ũ�� ǥ��.
		System.out.print("+");
		
		for (int i = 0; i < width; i++) { // width���� "-"ǥ���ؼ�
			System.out.print("-"); // �簢Ʋ�μ� �̿��Ѵ�.
		}
		
		System.out.println("+"); // �簢Ʋ�� �����̸� ǥ���ϴ� "+"��ũ�� ǥ��
	}
}
