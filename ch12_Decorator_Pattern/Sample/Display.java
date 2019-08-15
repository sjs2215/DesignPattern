package ch12.Sample;

// ���� �ٷ� �̷���� ���ڿ��� ǥ���ϱ� ���� �߻� Ŭ����
public abstract class Display {
	public abstract int getColumns(); // ������ ���ڼ��� ��´�.

	public abstract int getRows(); // ������ �ټ��� ��´�.

	public abstract String getRowText(int row); // row��°�� ���ڿ��� ��´�.

	//��� ���� ȭ�鿡 ǥ���ϴ� �޼ҵ�
	// Template Method ������ �����
	// ���ø� �޼ҵ�: �߻� �޼ҵ���� ȣ���ϴ� ������ �̷���� �޼ҵ�
	public final void show() { 
		for (int i = 0; i < getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
