package ch02.Sample1;

// �̹� �����ϴ� Ŭ����
public class Banner {
	private String string;

	public Banner(String string) {
		this.string = string;
	}

	public void showWithParen() {
		System.out.println("[" + string + "]");
	}

	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
