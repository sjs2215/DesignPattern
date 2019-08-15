package ch12.A1;

public class UpDownBorder extends Border {
    private char borderChar;                        // ����� �Ǵ� ����
    public UpDownBorder(Display display, char ch) {   // �����ڿ��� Display�� ��Ĺ��ڸ� ����
        super(display);
        this.borderChar = ch;
    }
    public int getColumns() {                       // ���ڼ��� ���빰�� ���ڼ��� ����
        return display.getColumns();
    }
    public int getRows() {                          // �ټ��� ���빰�� ���Ͽ� ��Ĺ��ں��� ���� ��
        return 1 + display.getRows() + 1;
    }
    public String getRowText(int row) {             // ���� ���� ����
        if (row == 0 || row == getRows() - 1) {
            return makeLine(borderChar, getColumns());
        } else {
            return display.getRowText(row - 1);
        }
    }
    private String makeLine(char ch, int count) { // ����ch��count�� ���ӽ�Ų ���ڿ��� �ۼ�
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
