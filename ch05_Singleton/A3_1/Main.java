package ch05.A3_1;

// Thread Ŭ������ ��ӹ޾Ƽ�, Main Ŭ���� �ڽ��� �����尡 �ȴ�.
public class Main extends Thread {
	public static void main(String[] args) {
		System.out.println("Start.");
        // ������ 3���� ������ �� �����Ų��.
		new Main("A").start(); // run( ) �� �ڵ����� ����ȴ�.
		new Main("B").start();
		new Main("C").start();
		System.out.println("End.");
	}

	public void run() {
		Singleton obj = Singleton.getInstance();
		System.out.println(getName() + ": obj = " + obj);
	}

	public Main(String name) {
		super(name);
	}
}
