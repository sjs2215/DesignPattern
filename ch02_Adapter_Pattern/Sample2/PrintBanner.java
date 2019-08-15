package ch02.Sample2;

//����� ������ �ϴ� Ŭ����
public class PrintBanner extends Print {
    private Banner banner; // Banner ��ü�� ����
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }
    public void printWeak() {
		// Banner ��ü�� banner�� showWithParen( )�� ȣ���Ѵ�.
		// printWeak( )�� �ڽ��� ���� ó������ �ʰ� banner���� �����Ѵ�.
        banner.showWithParen();
    }

    public void printStrong() {
	    // banner�� showWithAster()�� ȣ���Ѵ�.
        // PrintBanner �ڽ��� ���� ó������ �ʰ�, banner���� �����Ѵ�.
		banner.showWithAster();
    }
}
