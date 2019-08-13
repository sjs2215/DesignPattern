package ch01.Sample;

public class BookShelf implements Aggregate {
     // å������ å�� �����ϱ� ���� Book �迭�� �����Ѵ�.
	private Book[ ] books;  //�迭 ������ �����ϰ�, ������ �Ҵ���� �ʾҴ�.
    private int last = 0; // ������ å�� ���� ��ġ�� �����Ѵ�.

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize]; // ���⼭ �迭 ������ ������ �������.
    }

	 // �Է������� index�� �ش��ϴ� å�� ��ȯ�ϴ� �޼ҵ�
    public Book getBookFrom(int index) {
        return books[index];
    }

	// å���̿� å�� �ȴ� �޼ҵ�
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

	// å������ å ������ ��ȯ�ϴ� �޼ҵ�
    public int getLength() {
        return last;
    }

	// �ڽ��� Iterator�� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
    public Iterator iterator() {
		// �ڽ��� ���ڷ� �Ͽ� BookShelfIterator ��ü�� �����Ͽ� ��ȯ�Ѵ�.
        return new BookShelfIterator(this);  //this: ���� å����
    }
}









