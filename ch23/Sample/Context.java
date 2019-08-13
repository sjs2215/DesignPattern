package ch23.Sample;

import java.util.*;

// ���� �ؼ��� ���� �ʿ��� �������� �޼ҵ带 �����Ѵ�.
// �̴� ���α׷��� �����ϸ鼭, 
// �ʿ��� ������ ��ū���� �߶�(lexical analysis) 
// �� ��ū�� ��ȯ�ϴ� ���� ��
// ��ū: �̴� ���α׷��� �����ϴ� �⺻ ���� ���ڿ�
public class Context {
	// StringTokenizer: �־��� ���ڿ��� ��ū���� ������ �ִ� Ŭ����
	// ���� ����(delimiter): �����̽�(�� ��), ��(��\t��), ������(��\n��), ĳ��������(��\r��), ���ǵ�(��\f��)
	private StringTokenizer tokenizer;

	private String currentToken;

	public Context(String text) {
		// �־��� ���ڿ��� �̿��Ͽ� StringTokenizer ��ü�� �����Ѵ�.
		tokenizer = new StringTokenizer(text);
		nextToken(); // ù ��ū�� currentToken ������ �־��
	}

	// ���� ��ū�� ��ȯ��(���� ��ū���� ���ư�)
	public String nextToken() {
		if (tokenizer.hasMoreTokens()) {
			currentToken = tokenizer.nextToken();
		} else {
			currentToken = null;
		}
		return currentToken;
	}

	// ���� ��ū�� ��ȯ��
	public String currentToken() {
		return currentToken;
	}

	// �̴� ���α׷��� ���� ��ū�� �Է����� token�� ������ ���ؼ�, 
	// ������ ���� ��ū���� �����Ű�� �޼ҵ�
	public void skipToken(String token) throws ParseException {
		if (!token.equals(currentToken)) { // ���� ��ū�� �Է����� token�� ���ؼ�,
			throw new ParseException("Warning: " + token + " is expected, but "
					+ currentToken + " is found."); // �ٸ���, ���ܸ� �߻���Ų��.
		}
		nextToken(); // ������ ���� ��ū���� �����Ų��.
	}

	// ���� ��ū ���ڿ��� ������ �ٲپ��ִ� �޼ҵ�
	public int currentNumber() throws ParseException {
		int number = 0;
		try {
			number = Integer.parseInt(currentToken);
		} catch (NumberFormatException e) {
			throw new ParseException("Warning: " + e);
		}
		return number;
	}
}
