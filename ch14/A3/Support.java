package ch14.A3;
public abstract class Support {
    private String name;                  // �� Ʈ���� �ذ����� �̸�
    private Support next;                 // ���ѱ�� ��
    public Support(String name) {         // Ʈ���� �ذ����� ����
        this.name = name;
    }
    public Support setNext(Support next) {  // ���ѱ� ���� ����
        this.next = next;
        return next;
    }
    public final void support(Trouble trouble) {          
        for (Support obj = this; true; obj = obj.next) {
            if (obj.resolve(trouble)) {
                obj.done(trouble);
                break;
            } else if (obj.next == null) {
                obj.fail(trouble);
                break;
            }
        }
    }
    public String toString() {              // ���ڿ� ǥ��
        return "[" + name + "]";
    }
    protected abstract boolean resolve(Trouble trouble); // �ذ�� �޼ҵ�
    protected void done(Trouble trouble) {  // �ذ�
        System.out.println(trouble + " is resolved by " + this + ".");
    }
    protected void fail(Trouble trouble) {  // ���ذ�
        System.out.println(trouble + " cannot be resolved.");
    }
}
