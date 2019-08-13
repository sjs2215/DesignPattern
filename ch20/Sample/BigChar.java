package ch20.Sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// ��ū ���ڡ��� ��Ÿ���� Ŭ����
// ���Ϸκ��� ū ������ �ؽ�Ʈ�� �о� �޸� �� �ε��ϰ�, 
// print �޼ҵ忡�� �װ��� ǥ���Ѵ�.
// ū ���ڴ� �޸𸮸� ���� �����ϹǷ�, BigChar�� �ν��Ͻ��� ��������.
public class BigChar {
	// ������ �̸�
	private char charname;

	// ū ���ڸ� ǥ���ϴ� ���ڿ�
	private String fontdata;

	// �μ��� ������ ������ ��ū ���ڡ� ������ �ۼ��Ѵ�.
	public BigChar(char charname) {
		this.charname = charname;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("big"+ charname + ".txt"));
			String line;
			StringBuffer buf = new StringBuffer();
			// ���Ϸκ��� �� ���ξ� �о, ��\n���� �Բ� buf �� �߰��Ѵ�.
			while ((line = reader.readLine()) != null) {
				buf.append(line);
				buf.append("\n");
			}
			reader.close();
			this.fontdata = buf.toString();  // �ۼ��� ���ڿ��� fontdata�� ������
		} catch (IOException e) {
			this.fontdata = charname + "?";
		}
	}

	// ū ���ڸ� ǥ���Ѵ�.
	public void print() {
		System.out.print(fontdata);
	}
}
