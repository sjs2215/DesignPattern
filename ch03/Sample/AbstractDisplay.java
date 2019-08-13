package ch03.Sample;

// �߻� Ŭ���� AbstractDisplay
public abstract class AbstractDisplay {
	// ���� Ŭ������ ������ �ñ�� �߻�޼ҵ�(1)
	public abstract void open();

	// ���� Ŭ������ ������ �ñ�� �߻�޼ҵ�(2)
	public abstract void print();

	// ���� Ŭ������ ������ �ñ�� �߻�޼ҵ�(3)
	public abstract void close();

	// �߻� Ŭ�������� �����ϰ� �ִ� �޼ҵ� display
	// �������� �帧(�޽��� ȣ�� ����)�� �����Ѵ�.
	public final void display() {
		// �켱 open�ϰ�...
		open();

		// 5��print�� �ݺ��ϰ�...
		for (int i = 0; i < 5; i++) {
			print();
		}
		
		// ���������� close�Ѵ�. 
		close();
	}
}
