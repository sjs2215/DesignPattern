package ch03.Sample;

// CharDisplay�� AbstractDisplay�� ���� Ŭ����
public class CharDisplay extends AbstractDisplay {

	// ǥ���ؾ� �� ���ڸ� �����Ѵ�.
	private char ch;

	public CharDisplay(char ch) { // �����ڿ��� �Ѿ�� ����ch��
		this.ch = ch; // �ʵ�(�Ӽ�)�� ����� �д�.
	}

	// ���� Ŭ���������� �߻�޼ҵ忴��. ���⼭ �������̵� �ؼ� ����.
	public void open() {
		System.out.print("<<"); // ���� ���ڿ��μ� "<<"�� ǥ���Ѵ�.
	}

	// print�޼ҵ�� ���⼭ �����Ѵ�. �̰��� display���� �ݺ��ؼ� ȣ��ȴ�.
	public void print() {
		System.out.print(ch); // �ʵ忡 ����ص� ���� 1���� ǥ��
	}

	// close�޼ҵ嵵 ���⼭ ����
	public void close() {
		System.out.println(">>"); // ���Ṯ�ڿ� ">>"�� ǥ��.
	}
}
