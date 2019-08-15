package ch12.Sample;

// ��ü���� ����� ����
// ���ڿ� �¿쿡 ������ ����(BorderChar)�� ����Ѵ�.
public class SideBorder extends Border {
	private char borderChar; // ����� �Ǵ� ����

	// �����ڿ���, ���빰(display)�� ��� ����(ch)�� ������
	public SideBorder(Display display, char ch) { 
		super(display);
		this.borderChar = ch;
	}

	// ���빰�� ���� ���� 2(���빰�� ���ʿ� ��� ���ں�)�� ���Ѵ�.
	public int getColumns() {
		return 1 + display.getColumns() + 1;
	}

	// �ټ��� ���빰�� �ټ��� �����Ƿ�, ���빰�� getRows( )�� ȣ���Ѵ�.
	public int getRows() { 
		return display.getRows();
	}

	// ������ ���� ���빰�� Text ���ʿ� ��� ���ڸ� �����Ͽ� ��ȯ�Ѵ�.
	public String getRowText(int row) { 
		return borderChar + display.getRowText(row) + borderChar;
	}
}
