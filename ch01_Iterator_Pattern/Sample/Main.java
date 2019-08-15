package ch01.Sample;

public class Main {
	// ��� �ڹ� ���α׷��� main() �޼ҵ���� ���۵ȴ�.
    public static void main(String[] args) {
    	// �ִ� 4���� å�� ���� �� �ִ� å���̸� �����Ѵ�.
        BookShelf bookShelf = new BookShelf(4);
        Aggregate bookShelf2 = new BookShelf(4);
        // 4���� å�� �ȴ´�.
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

		// å������ Iterator�� ���´�.
        // ���� �����Ǵ� ��ü�� Ÿ���� BookShelfIterater�̴�.
		Iterator it = bookShelf.iterator();
        
		// å�� ����ؼ� ������ while ������ ����.
		// å�� �� �ִ��� �˻��ϱ� ���ؼ�, iterator�� hasNext()�� ȣ���Ѵ�.
		while (it.hasNext()) {
			Book book = (Book)it.next(); // ���� å�� ���´�.
			// �� ���� ��ſ�
			// Object book = it.next();
			// �� ����ϸ� �� �ȴ�.
            // �ֳ��ϸ�, �Ʒ����� book.getName()�� ȣ���ϴµ�,
			// Object Ÿ���� getName() �� �������� �ʴ´�.
			// ����,  it.next( )�� ��ȯ�� Object ���� Book ������ "��������ȯ"�ؾ� �Ѵ�.

			// å�� �̸��� ����Ѵ�.
			System.out.println("" + book.getName());
           
        }

        // å���̿� ���� �����ؼ� �� å�� ���ͼ� å�� �̸��� ����Ѵ�.
		// iterator�� ������� �ʴ´�.
		for(int i=0; i<bookShelf.getLength(); i++) {
			Book book = bookShelf.getBookFrom(i);
            System.out.println("" + book.getName());
	    }
    }
}





