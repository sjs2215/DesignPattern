package ch01.Sample;

// å���̿� ���� å�� ��Ÿ���� Ŭ����
public class Book {
    private String name = ""; // å�� �̸��� �����Ѵ�.

	// ���ڿ��� �Է� ���ڷ� �޾Ƽ� �ڽ��� �Ӽ��� name�� �����Ѵ�.
    public Book(String name) {
        this.name = name;
    }

	// �ڽ��� �̸��� ��ȯ�ϴ� �޼ҵ�
    public String getName() {
        return name;
    }
}


// Book b1 = new Book("�ڹ�");