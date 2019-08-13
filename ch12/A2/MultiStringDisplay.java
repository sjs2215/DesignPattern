package ch12.A2;

import java.util.Vector;

public class MultiStringDisplay extends Display {
	private Vector body = new Vector(); // ǥ�� ���ڿ�

	private int columns = 0; // �ִ� ���ڼ�

	public void add(String msg) { // ���ڿ� �߰�
		body.add(msg);
		updateColumn(msg);
	}

	public int getColumns() { // ���ڼ�
		return columns;
	}

	public int getRows() { // �� ��
		return body.size();
	}

	public String getRowText(int row) { // ���� ����
		return (String) body.get(row);
	}

	// �� �� ���ڿ��� �߰��Ǹ�, ������ ���ڿ����� ���� �˸��� ������ �� ĭ�� �߰��Ѵ�.
	private void updateColumn(String msg) { // ���ڼ��� �����Ѵ�.
		if (msg.getBytes().length > columns) {
			columns = msg.getBytes().length;
		}
		for (int row = 0; row < body.size(); row++) {
			int fills = columns - ((String) body.get(row)).getBytes().length;
			if (fills > 0) {
				body.set(row, body.get(row) + spaces(fills)); // row ��ġ��, ���ŵ� ���ڿ��� ��ġ�Ѵ�.
			}
		}
	}

	// count ��ŭ�� ���� ���ڿ��� �����.
	private String spaces(int count) { 
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(' ');
		}
		return buf.toString();
	}
}
