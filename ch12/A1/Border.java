package ch12.A1;

public abstract class Border extends Display {
    protected Display display;          // ����� ���ΰ� �ִ� "���빰"�� ����Ų��.
    protected Border(Display display) { // �ν��Ͻ� �����ÿ� "���빰"�� �μ��� ����
        this.display = display;
    }
}
