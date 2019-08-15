package ch12.Sample;

// �����¿쿡 ����� �ٴ� Ŭ����
// SideBorder�� �޸�, ����� ���ڰ� �̸� �����Ǿ� �ִ�.
public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }
    // ���ڼ��� ���빰�� ���ʿ� �¿��� ��� ���ں��� ���� ��
    public int getColumns() {                   
        return 1 + display.getColumns() + 1;
    }
    //  �ټ��� ���빰�� �ټ��� ������ ��Ĺ��ں��� ���� ��
    public int getRows() {                     
        return 1 + display.getRows() + 1;
    }
    // ������ ���� ������ ��ȯ��
    public String getRowText(int row) { 
        if (row == 0) {                                                 // ����� ����� ���
            return "+" + makeLine('-', display.getColumns()) + "+"; // "+---------------------+" �� �����.
        } else if (row == display.getRows() + 1) {                      // ����� �ϴ��� ���
            return "+" + makeLine('-', display.getColumns()) + "+";  // "+---------------------+" �� �����.
        } else {                                                        // �� ���� ���
            return "|" + display.getRowText(row - 1) + "|";
        }
    }
    
    // ch�� count ���� ��ŭ �����ؼ� ���ڿ��� ����� �޼ҵ�
    private String makeLine(char ch, int count) {  
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
