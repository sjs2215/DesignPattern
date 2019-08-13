package ch14.Sample;

// Ʈ������ �ذ��� ���⸦ ����� ���� �߻� Ŭ����
public abstract class Support {
	private String name; // Ʈ���� �ذ����� �̸�

	// �ڱ� ���� ���� Ʈ������ �ذ��� ��ü(���ѱ�⸦ �� ��)�� ����Ų��.
	private Support next;

	public Support(String name) { // Ʈ���� �ذ����� ����
		this.name = name;
	}

	public Support setNext(Support next) { // ���ѱ� ���� ����
		this.next = next;
		return next; // �ڱ� ���� �ذ��ڸ� ��ȯ�Ѵ�.
	}

	// ���ø� �޼ҵ� <- resolve( )�� �߻� �޼ҵ��̴�.
	public final void support(Trouble trouble) { 
	    if (resolve(trouble)) { // resolve( ) �޼ҵ带 ȣ���ؼ� �����ϸ�...
			done(trouble); // �ذ�Ǿ��ٰ� ����Ѵ�.
		} else if (next != null) { // ��ȯ ���� false �̸�, �ڱ� ���� �ذ��ڿ��� Ʈ������ ���ѱ��.
			next.support(trouble);
		} else { // �ڱ� �� ó���ڰ� ������...
			fail(trouble); // ���ذ�Ǿ��ٰ� ����Ѵ�.
		}
	}

	public String toString() { // ���ڿ� ǥ��
		return "[" + name + "]";
	}

	protected abstract boolean resolve(Trouble trouble); // �ذ�� �޼ҵ�

	protected void done(Trouble trouble) { // �ذ�
		System.out.println(trouble + " is resolved by " + this + ".");
	}

	protected void fail(Trouble trouble) { // ���ذ�
		System.out.println(trouble + " cannot be resolved.");
	}
}
