package ch20.A2;
public class BigString {
    //  "ū ����"�� �迭
    private BigChar[] bigchars;
    //  ������
    public BigString(String string) {
        init_shared(string);
    }
    // ������
    public BigString(String string, boolean shared) {
        if (shared) {
            init_shared(string);
        } else {
            init_unshared(string);
        }
    }
    // �����ؼ� �ʱ�ȭ
    private void init_shared(String string) {
        bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i)); 
        }
    }
    // �������� �ʰ� �ʱ�ȭ
    private void init_unshared(String string) {
        bigchars = new BigChar[string.length()];
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = new BigChar(string.charAt(i));    
        }
    }
    //ǥ��
    public void print() {
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i].print();
        }
    }
}
