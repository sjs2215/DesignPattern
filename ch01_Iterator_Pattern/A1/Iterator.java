package ch01.A1;

// ����ü�� ���Ҹ� �ϳ��ϳ� ������� ���� ������ ���� ������ �Ѵ�.
public interface Iterator {
	// ���� ���Ұ� �����ϴ��� ������ �� ����ϴ� �޼ҵ�
	// ��ȯ���� boolean (������ ���ҿ� �����ϸ� false�� ��ȯ��)
    public abstract boolean hasNext();
    // ���� ���Ҹ� ���� �� ����ϴ� �޼ҵ�
    // ��ȯ���� Object
    public abstract Object next();
}