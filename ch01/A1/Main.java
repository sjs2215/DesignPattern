package ch01.A1;

public class Main {
    public static void main(String[] args) {
    	// å���̸� �����.
        BookShelf bookShelf = new BookShelf(4);
        
        // å�� ���� å���̿� �ִ´�
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("East of Eden"));
        bookShelf.appendBook(new Book("Frankenstein"));
        bookShelf.appendBook(new Book("Gulliver's Travels"));
        bookShelf.appendBook(new Book("Hamlet"));
        
        // å������ å�� �ϳ��� ����� Iterator�� ��´�.
        Iterator it = bookShelf.iterator();
        
        // Iterator�� hasNext( )�� next( ) �޼ҵ带 �̿��Ͽ� 
        // å�� �ϳ��� ������� å�� �̸��� ����Ѵ�.
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println("" + book.getName()); // å�� �̸��� ����
        }
    }
}
