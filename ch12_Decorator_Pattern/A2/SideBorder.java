package ch12.A2;

public class SideBorder extends Border {
    private char borderChar;                        // ����� �Ǵ� ����
    public SideBorder(Display display, char ch) {   // �����ڿ��� Display�� ��Ĺ��ڸ� ����
        super(display);
        this.borderChar = ch;
    }
    public int getColumns() {                       // ���ڼ��� ���빰�� ���ʿ� ��� ���ں��� ���� ��
        return 1 + display.getColumns() + 1;
    }
    public int getRows() {                          // �ټ��� ���빰�� �ټ��� ����
        return display.getRows();
    }
    public String getRowText(int row) {             // ������ ���� ������ ���빰�� ���� ���� ���ʿ� ��Ĺ��ڸ� ���� ��
        return borderChar + display.getRowText(row) + borderChar;
    }
}
