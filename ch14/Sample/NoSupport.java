package ch14.Sample;

public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }
    
    // �ذ�� �޼ҵ�
    // �׻� false�� ��ȯ�Ѵ�.
    protected boolean resolve(Trouble trouble) {    
        return false; // �ڽ��� �ƹ� ó���� ���� �ʴ´�.
    }
}
