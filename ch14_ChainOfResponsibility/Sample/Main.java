package ch14.Sample;

public class Main {
	public static void main(String[] args) {
		// ���� ���� Ʈ���� �ذ��� ����
		Support alice = new NoSupport("Alice");
		Support bob = new LimitSupport("Bob", 100);
		Support charlie = new SpecialSupport("Charlie", 429);
		Support diana = new LimitSupport("Diana", 200);
		Support elmo = new OddSupport("Elmo");
		Support fred = new LimitSupport("Fred", 300);
		
		// Chain of Responsibility ����
		// ������ ��: alice.setNext(bob)�� ��ȯ���� bob ��ü(�� ���� ����)�̴�.
		alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
		
		// �پ��� Ʈ���� �߻��ؼ� ù��° �ذ����� alice ���� �ذ��� ��û�Ѵ�.
		for (int i = 0; i < 500; i += 33) {
			alice.support(new Trouble(i));
		}
	}
}
