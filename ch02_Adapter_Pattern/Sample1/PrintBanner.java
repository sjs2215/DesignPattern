package ch02.Sample1;

// ����� ������ �ϴ� Ŭ����
public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}

	// Banner�κ��� ��ӹ��� showWithParen()�� ȣ���Ѵ�.
	public void printWeak() {
		showWithParen();
	}

	// ��ӹ��� showWithAster( )�� ȣ���Ѵ�.
	public void printStrong() {
		showWithAster();
	}
}
