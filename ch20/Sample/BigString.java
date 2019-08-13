package ch20.Sample;

// BigChar���� ���� ��ū ���ڿ��� Ŭ����
public class BigString {
	// "ū ����"�� �迭
	private BigChar[] bigchars;

	// ������
	// �Է� ������ ���ڿ��� �ش��ϴ� "ū ���ڿ�"�� �����. 
	public BigString(String string) {
		bigchars = new BigChar[string.length()];
		BigCharFactory factory = BigCharFactory.getInstance();

		// �ʵ� bigchars �迭�� �� ���Ҵ� 
		// BigCharFactory�κ��� BigChar�� �� �����Ѵ�.
		for (int i = 0; i < bigchars.length; i++) {
			bigchars[i] = factory.getBigChar(string.charAt(i));
		}
		
		// ����: 
		// BigCharFactory��, 
		// �̹� ������ BigChar�� ��쿡�� 
		// ������ BigChar �ν��Ͻ��� ��ȯ�ϹǷ�, 
		// bigchars �迭�� �� ���Ҵ� ���� ���ڿ� ���ؼ��� BigChar ��ü�� �����Ѵ�.
		
		// (����) �Ź� ���ο� �ν��Ͻ��� �����ϴ� ���
/*
		for (int i = 0; i < bigchars.length; i++) {
	        bigchars[i] = new BigChar(string.charAt(i));
	    }
*/

	}

	// ǥ��
	public void print() {
		for (int i = 0; i < bigchars.length; i++) {
			bigchars[i].print();
		}
	}
}
