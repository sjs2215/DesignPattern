package ch23.Sample;

// ���� Ʈ���� �� �κ�(���)�� ��ǥ�ϴ� �ֻ����� Ŭ����

public abstract class Node {
	// ������ �ؼ����̶�� ó���� �����ϱ� ���� �޼ҵ�
	// �Է� ���� Context��,
	// ���� ���� �ؼ��� �����ϰ� �ִ� ����Ȳ���� ��Ÿ���� Ŭ����
	// �Է� ���� �߿��� ���� ��� ��ū���� �ؼ��� ����Ǿ������� �˰� �ִ�.
	// ���� �ؼ� �߿� ������ �߻��ϸ�, ParseException�� ������.
	public abstract void parse(Context context) throws ParseException;
}
