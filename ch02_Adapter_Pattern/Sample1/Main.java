package ch02.Sample1;

public class Main {
	public static void main(String[] args) {
		// p�� Print �������̽� ������ ����Ǿ���,
		// �����δ� PrintBanner ��ü�� �����Ͽ� ����Ų��.
		// Print�� PrintBanner�� �θ��̹Ƿ� �����ϴ�.
		Print p = new PrintBanner("Hello");

		// ���� ���� �����ϴ� Banner Ŭ������ �޼ҵ��,
		// Main Ŭ���������� ������ ����Ǿ� �ִ�.
		p.printWeak();
		p.printStrong();
	}
}
