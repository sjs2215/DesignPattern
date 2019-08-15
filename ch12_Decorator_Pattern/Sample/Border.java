package ch12.Sample;

// ����ġ��� ��Ÿ���� �߻� Ŭ����
// StringDisply�� Border�� ��� Display�� ���� Ŭ�����̴�. 
// => StringDisplay(���빰)�� Border(�����)�� ���Ͻ��Ѵ�.
// => ��, ����ڵ� �Ǵٸ� ������� ���빰�� �� �� �ִ�.
public abstract class Border extends Display {
	protected Display display; // ����� ���ΰ� �ִ� "���빰"�� ����Ų��.
	                           // StringDisplay �� �� �ƴ϶� Border �� ������ �� �ִ�.
	                           // ����: Border�� Display�� ���� Ŭ�����̹Ƿ�

	protected Border(Display display) { // �ν��Ͻ� �����ÿ� "���빰"�� �μ��� ����
		this.display = display;
	}
}
