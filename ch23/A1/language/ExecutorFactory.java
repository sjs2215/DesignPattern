package ch23.A1.language;

public interface ExecutorFactory {
	// ���� �׼��� ���ϴ� Executor ��ü�� �����ϴ� �޼ҵ�
    public abstract Executor createExecutor(String name);
}
