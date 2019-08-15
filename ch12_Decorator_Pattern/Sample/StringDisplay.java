package ch12.Sample;

// ���� ����ũ�� �߽ɿ� �ִ� ������ ����ũ�� �ش��ϴ� Ŭ����
public class StringDisplay extends Display {
	private String string; // ǥ���� ���ڿ��� ������

	public StringDisplay(String string) { // �μ��� ǥ�ù��ڿ��� ����
		this.string = string;
	}

	public int getColumns() { // ���ڼ�
		return string.getBytes().length; // ���ڿ��� �����ϴ� ����Ʈ ���� ��ȯ��
	}

	public int getRows() { // �ټ��� 1
		return 1;
	}

	// �Է� �Ű� ���� row�� 0�� ���� string �ʵ带 ��ȯ�Ѵ�.
	public String getRowText(int row) {
		if (row == 0) {
			return string;
		} else {
			return null;
		}
	}
}
