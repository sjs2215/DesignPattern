package ch01.A1;

// å����(BookShelf)�� �ִ� å���� �ϳ��� ������� ���� �ϴ� Ŭ����
// Iterator �������̽��� �����Ͽ���
public class BookShelfIterator implements Iterator {
	// BookShelfIterator�� �˻��� å���̸� ����Ű�� ����
	// (�����ڿ��� �Ѱܹ��� BookShelf�� �ν��Ͻ��� ������ ����)
	private BookShelf bookShelf;
	// å���̿����� ���� å�� ����Ű�� ����
	private int index;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	// ���� å�� ������ true, ������ false�� ��ȯ��
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	// ���� ����Ű�� �ִ� å�� ��ȯ�ϰ�, ���� å�� ����Ű�� �޼ҵ�
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
