package ch02.Sample2;

//Main(client) �� �ʿ���ϴ� �޼ҵ尡 ����Ǿ� ����
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
