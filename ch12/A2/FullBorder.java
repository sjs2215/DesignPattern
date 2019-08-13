package ch12.A2;

public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }
    public int getColumns() {                   // ���ڼ��� ���빰�� ���ʿ� �¿��� ��� ���ں��� ���� ��
        return 1 + display.getColumns() + 1;
    }
    public int getRows() {                      // �ټ��� ���빰�� �ټ��� ������ ��Ĺ��ں��� ���� ��
        return 1 + display.getRows() + 1;
    }
    public String getRowText(int row) {         // ������ ���� ����
        if (row == 0) {                                                 // ����� ���
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {                      // ����� �ϴ�
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {                                                        // �� �ۿ�
            return "|" + display.getRowText(row - 1) + "|";
        }
    }
    private String makeLine(char ch, int count) {         // ����ch��count�� ���� ��Ų ���ڿ��� �����.
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
