package ch01.Sample;

// å���̿� ���� å�� �������� ���ƴٴϴµ� ���� Ŭ����
public class BookShelfIterator implements Iterator {
    // �� Iterator�� ���ƴٴ� å���̸� ����Ű�� �Ӽ�
	private BookShelf bookShelf;
    // ���� å ��ȣ�� �����ϴ� �Ӽ�
	private int index;

	// �Է������� BookShelf ��ü�� �ڱ� �Ӽ��� bookShelf�� �����Ѵ�.
	// ���߿� �� �Ӽ��� �̿��ؼ� å���̸� ���ƴٴѴ�.
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;  // å���̸� ���ƴٴϱ� ���̹Ƿ�, 0���� �ʱ�ȭ�Ѵ�.
    }

    // å���̿� ������ å�� �� �ִ��� �˻��ϴ� �޼ҵ�
    public boolean hasNext() {
		// ���� å ��ȣ�� å���̿� �ִ� å �������� ������,
	    // å���̿� ���ƴٴ� å�� �� �ִ� ���̹Ƿ� true�� ��ȯ�Ѵ�.
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

	// ���� å�� �������� �� �� ȣ��Ǵ� �޼ҵ�
	// ��ȯ���� Object Ÿ���̴�. 
	//  - Object�� ��� Ŭ������ �θ� Ŭ�����̹Ƿ� ��� �ڽ��� ����ų �� �ִ�.  
	//  - ��, ��� Ÿ���� ��ü�� ��ȯ�� �� �ִ�.
	//  - ������ ��ȯ�Ǵ� ��ü�� Book Ÿ���̹Ƿ�, �ùٸ� ��ȯ������ ����� ���̴�.
    public Object next() {
        // �� Iterator�� ����Ű�� å������ getBookAt(index)�� �̿��ؼ�
		// index å��ȣ�� �ش��ϴ� å�� ���ͼ� book�� �����Ѵ�.
		Book book = bookShelf.getBookFrom(index);
        // ���� å��ȣ�� 1 ������Ų��.
		index++;
		// ���� å�� ��ȯ�Ѵ�.
        return book;
    }
}






