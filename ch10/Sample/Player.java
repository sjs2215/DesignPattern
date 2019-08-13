package ch10.Sample;

public class Player {
	private String name;

	private Strategy strategy;

	private int wincount;

	private int losecount;

	private int gamecount;

//	 �̸��� ������ ���ڷ� ���޹޴´�.
	public Player(String name, Strategy strategy) { 
		this.name = name;
		this.strategy = strategy;
	}

	public Hand nextHand() { // ������ ���ø� �޴´�.
		return strategy.nextHand();
	}

	// �̰��� �� ȣ��Ǵ� �޼ҵ�
	public void win() { 
		strategy.study(true);
		wincount++;
		gamecount++;
	}
//	���� �� ȣ��Ǵ� �޼ҵ�
	public void lose() {
		strategy.study(false);
		losecount++;
		gamecount++;
	}
//	����� �� ȣ��Ǵ� �޼ҵ�
	public void even() { // ���º�
		gamecount++;
	}

	public String toString() {
		return "[" + name + " / ���� ����:" + gamecount + " games, " + wincount
				+ " win, " + losecount + " lose" + "]";
	}
}
