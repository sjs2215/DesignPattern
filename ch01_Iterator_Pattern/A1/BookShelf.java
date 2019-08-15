package ch01.A1;

// å���� �����ϱ� ���ؼ� Vector�� ����Ѵ�.
import java.util.Vector;

// å���̸� ��Ÿ���� Ŭ���� = ����ü(aggregate)
public class BookShelf implements Aggregate {
	// Book�� �迭
	// �� �迭�� ũ���, ������(BookShelf( )) ȣ�� �� �����ȴ�.
	private Vector books;

	public BookShelf(int initialsize) {
		this.books = new Vector(initialsize);
	}

	public Book getBookAt(int index) {
		return (Book) books.get(index);
	}

	// å �� ���� ������ �߰��ϴ� �޼ҵ�
	public void appendBook(Book book) {
		books.add(book);
	}

	// ���� å���̿� �ִ� å�� ������ ��ȯ�ϴ� �޼ҵ�
	public int getLength() {
		return books.size();
	}

	// å������ å �ϳ��ϳ��� ������� ���� �ϴ�
	// BookShelfIterator�� �����ϴ� �޼ҵ�
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
