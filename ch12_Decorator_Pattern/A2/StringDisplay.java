package ch12.A2;

public class StringDisplay extends Display {
    private String string;                          // ǥ�ù��ڿ�
    public StringDisplay(String string) {           // �μ��� ǥ�ù��ڿ��� ����
        this.string = string;
    }
    public int getColumns() {                       // ���ڼ�
        return string.getBytes().length;
    }
    public int getRows() {                          // �ټ��� 1
        return 1;
    }
    public String getRowText(int row) {             // row�� 0�϶��� ��ȯ�Ѵ�.
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
