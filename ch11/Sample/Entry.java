package ch11.Sample;

public abstract class Entry {
	public abstract String getName(); // �̸��� ��´�.

	public abstract int getSize(); // ����� ��´�.

	public Entry add(Entry entry) throws FileTreatmentException {
		// �� Ŭ������ �ٸ� ��Ʈ���� �߰��Ϸ��� �ϸ�, ���ܸ� �߻���Ų��.
		// "�ڽ��� ó������ �ʰ�, �� �޼ҵ带 ȣ���� ��ü�� ���Ľ�Ų��"��� ����Ǿ� ����.
		throw new FileTreatmentException();
	}

	public void printList() { // �϶��� ǥ���Ѵ�.
		printList("");
	}

	protected abstract void printList(String prefix); // prefix�� �տ� �ٿ��� �϶���
														// ǥ���Ѵ�.

	public String toString() { // ���ڿ� ǥ��
		return getName() + " (" + getSize() + ")";
	}
}
