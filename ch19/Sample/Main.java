package ch19.Sample;

//public class Main extends Thread {
public class Main {
	public static void main(String[] args) {
		SafeFrame frame = new SafeFrame("State Sample");
		
		// 1�� �������� SafeFrame�� setClock( ) �޼ҵ带 ȣ���Ѵ�.
		while (true) {  // ���ѷ���
			for (int hour = 0; hour < 24; hour++) {
				frame.setClock(hour); // �ݰ��� �ð��� �����Ѵ�.
				try {
					Thread.sleep(1000); // 1�ʰ� ����.
				} catch (InterruptedException e) {
				}
			}
		}
	}
}
