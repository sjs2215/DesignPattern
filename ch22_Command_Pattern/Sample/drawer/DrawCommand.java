package ch22.Sample.drawer;

import ch22.Sample.command.Command;
import java.awt.Point;

// ���׸� �׸��� ��ɡ��� ǥ����
public class DrawCommand implements Command {
	// �׸� �׸��⸦ ������ ���(��ü)�� ������
	protected Drawable drawable;

	// �׸� �׸��� ��ġ
	private Point position;
	// java.awt.Point Ŭ����: X��ǥ�� Y��ǥ�� ���� Ŭ����
	// 2���� ��� ���� ��ġ�� ��Ÿ��
	// �Ӽ����� x, y�� ������.

	// ������
	public DrawCommand(Drawable drawable, Point position) {
		this.drawable = drawable;
		this.position = position;
	}

	// ���� �׸��⸦ �����ϴ� �޼ҵ�
	// drawable �ʵ��� draw �޼ҵ带 ȣ����
	public void execute() {
		drawable.draw(position.x, position.y);
	}
}
