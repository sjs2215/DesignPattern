package ch10.Sample;

// �� �÷��̾ �����ϰ� �̵�� ���� ���� ���� �� �ºθ� ���� ���� �ϴ� Ŭ����
public class Main {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: java Main randomseed1 randomseed2");
			System.out.println("Example: java Main 314 15");
			System.exit(0);
		}

		// ���������⸦ ����µ� ���Ǵ� seed�� ����� ���ڷ� �޾Ƶ鿩 ������ �ٲ۴�.
		// ���� seed�� ������� �� ���� Random ��ü�� �Ȱ��� �������� ���ʷ� �߻���Ų��. 
		int seed1 = Integer.parseInt(args[0]);
		int seed2 = Integer.parseInt(args[1]);

		// ���� �ٸ� ������ ������ ���� 2���� �����Ѵ�.
		Player player1 = new Player("ȫ�浿", new WinningStrategy(seed1));
		Player player2 = new Player("�Ӳ���", new ProbStrategy(seed2));

		// 100�� ������ ��Ų��.
		for (int i = 0; i < 100; i++) {
			Hand nextHand1 = player1.nextHand();
			Hand nextHand2 = player2.nextHand();
			if (nextHand1.isStrongerThan(nextHand2)) {
				System.out.println("Winner:" + player1);
				player1.win();
				player2.lose();
			} else if (nextHand2.isStrongerThan(nextHand1)) {
				System.out.println("Winner:" + player2);
				player1.lose();
				player2.win();
			} else {
				System.out.println("Even...");
				player1.even();
				player2.even();
			}
		}

		System.out.println("Total result:");
		System.out.println("" + player1);
		// System.out.println(player1); => �ȴ�
		System.out.println("" + player2);
	}
}
