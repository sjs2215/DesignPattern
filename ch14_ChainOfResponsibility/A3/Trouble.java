package ch14.A3;
public class Trouble {
    private int number;             // Ʈ���� ��ȣ
    public Trouble(int number) {    // Ʈ������ ����
        this.number = number;
    }
    public int getNumber() {        // Ʈ���� ��ȣ�� ��´�.
        return number;
    }
    public String toString() {      // Ʈ������ ���ڿ� ǥ��
        return "[Trouble " + number + "]";
    }
}
