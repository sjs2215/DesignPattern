package ch14.Sample;

// Ȧ�� ��ȣ�� Ʈ������ ó���ϴ� Ŭ����
public class OddSupport extends Support {
	public OddSupport(String name) { // ������
		super(name);
	}

	protected boolean resolve(Trouble trouble) { // �ذ�� �޼ҵ�
		if (trouble.getNumber() % 2 == 1) { // 2�� ���� �������� 1�̸� , Ȧ���̴�.
			return true;
		} else {
			return false;
		}
	}
}
