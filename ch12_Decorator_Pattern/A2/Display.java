package ch12.A2;

public abstract class Display {
    public abstract int getColumns();               // ������ ���ڼ��� ��´�.
    public abstract int getRows();                  // ������ �ټ��� ��´�.
    public abstract String getRowText(int row);     // row��°�� ���ڿ��� ��´�.
    public final void show() {                      // ���� ǥ���Ѵ�.
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
