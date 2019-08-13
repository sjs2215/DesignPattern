package ch23.A1.turtle;

import ch23.A1.language.Executor;
import ch23.A1.language.ExecutorFactory;
import java.awt.*;


// �׸����� �����ϸ鼭, �׸��ǿ� �׸��� �׸� Executor ��ü�� �����ϴ� Ŭ����
public class TurtleCanvas extends Canvas implements ExecutorFactory {
	final static int UNIT_LENGTH = 30; // ������ ���� ������ ����

	final static int DIRECTION_UP = 0; // ���� ���Ѵ�.

	final static int DIRECTION_RIGHT = 3; // ����

	final static int DIRECTION_DOWN = 6; // �Ʒ��� ���Ѵ�.

	final static int DIRECTION_LEFT = 9; // ����

	final static int RELATIVE_DIRECTION_RIGHT = 3; // �������� ��� 3�� ���Ѵ�.

	final static int RELATIVE_DIRECTION_LEFT = -3; // �������� ��� 3�� ����.

	final static int RADIUS = 3; // �ݰ�

	private int direction = 0; // 0, 3, 6, 9 �� �ϳ��� ���� ������.

	private Point position;

	public TurtleCanvas(int width, int height) {
		setSize(width, height);
		initialize();
	}

	// ���� ���⿡�� ������ �Ǵ� ����츦 ��Ű�� �޼ҵ�
	void setRelativeDirection(int relativeDirection) {
		setDirection(direction + relativeDirection);
		// ��1: ���� ������ 0�ε�, relativeDirection�� -3�̸� �����ڰ��� -3(����)�� �ȴ�. => 9�� �ٲپ��
		// �Ѵ�.
		// ��2: ���� ������ 9�ε�, , relativeDirection�� +3�̸� �����ڰ��� 12�� �ȴ�. => 0���� �ٲپ��
		// �Ѵ�.
	}

	void setDirection(int direction) {
		// ������ ��Ÿ���� ���� ������ ���, (��: -3)
		if (direction < 0) {
			direction = 12 - (-direction) % 12; // direction�� ������ ���, ����� �����.
												// (��1: 12-(+3)%12 => 9�� �ȴ�)
		} else {
			direction = direction % 12; // direction�� 12�� ��쿡 0���� �����.
		}
		this.direction = direction % 12;
	}

	// ���� ���⿡ ���� x�� y ��ǥ ���� ���� ������ ��, 
	// ���� ��ġ(position.x, position.y)���� ���ο� ��ġ(newx, newy) ���� ������ �׸��� �Լ� 
	void go(int length) {
		// ���� �̵� ���⿡ ���� ���ο� ��ġ ����
		int newx = position.x;
		int newy = position.y;
		switch (direction) {
		case DIRECTION_UP:
			newy -= length; // ���� ������, y ��ǥ�� ���δ�.
			break;
		case DIRECTION_RIGHT:
			newx += length; // ���� ������ �����̸�, x ��ǥ�� ������Ų��.
			break;
		case DIRECTION_DOWN:
			newy += length; // ���� ������ �Ʒ����̸�, y ��ǥ�� ������Ų��.
			break;
		case DIRECTION_LEFT:
			newx -= length;
			break;
		default:
			break;
		}
		
		// ���� ��ġ���� ���ο� ��ġ�� ������ �׸�
		Graphics g = getGraphics();
		if (g != null) {
			g.drawLine(position.x, position.y, newx, newy); // ���� �߰�
			g.fillOval(newx - RADIUS, newy - RADIUS, RADIUS * 2 + 1,
					RADIUS * 2 + 1); // �� ������ ���� ��(��) �� �׸���.
		}
		position.x = newx;
		position.y = newy;
	}

	// canvas�� �׸��� �׸��� ���� �ϴ� Executor ��ü�� ������
	public Executor createExecutor(String name) {
		if (name.equals("go")) {
			return new GoExecutor(this);
		} else if (name.equals("right")) {
			// ������� ���� +3 ����
			return new DirectionExecutor(this, RELATIVE_DIRECTION_RIGHT);
		} else if (name.equals("left")) {
			// �������� ���� -3 ����
			return new DirectionExecutor(this, RELATIVE_DIRECTION_LEFT);
		} else {
			return null;
		}
	}

	// canvas�� �ʱ�ȭ�ϴ� �޼ҵ�
	public void initialize() {
		Dimension size = getSize();
		position = new Point(size.width / 2, size.height / 2); // ���� ���� ��ġ
		direction = 0;
		setForeground(Color.red);
		setBackground(Color.white);
		Graphics g = getGraphics();
		if (g != null) {
			g.clearRect(0, 0, size.width, size.height);
		}
	}
}

// Executor���� ���� Ŭ����
abstract class TurtleExecutor implements Executor {
	protected TurtleCanvas canvas;

	public TurtleExecutor(TurtleCanvas canvas) {
		this.canvas = canvas;
	}

	public abstract void execute();
}

// ���� ���� �������� ������ ũ�⸸ŭ �����̴� executor
class GoExecutor extends TurtleExecutor {
	public GoExecutor(TurtleCanvas canvas) {
		super(canvas);
	}

	public void execute() {
		canvas.go(TurtleCanvas.UNIT_LENGTH);
	}
}

// ��ȸ��, ��ȸ�� ������ �ٲپ��ִ� executor
class DirectionExecutor extends TurtleExecutor {
	private int relativeDirection;

	public DirectionExecutor(TurtleCanvas canvas, int relativeDirection) {
		super(canvas);
		this.relativeDirection = relativeDirection;
	}

	// execute( ) �� ȣ��� ������ +3 �Ǵ� -3�� canvas�� ���޵�
	public void execute() {
		canvas.setRelativeDirection(relativeDirection);
	}
}
