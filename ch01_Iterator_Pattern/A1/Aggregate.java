package ch01.A1;

// ����ü�� ��Ÿ��
public interface Aggregate {
	// ����ü�� �����ϴ� Iterator �� ���� �����ϴµ� ���� �޼ҵ�
	// � ����ü�� ���Ҹ� �ϳ��� �����ϰų� �����ϰ��� �� �� 
	// �� �޼ҵ带 ����ؼ� Iterator �������̽��� ������ 
	// Ŭ������ �ν��Ͻ��� �� �� ���´�.
    public abstract Iterator iterator();
}
