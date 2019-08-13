package ch22.A1.drawer;

import ch22.A1.command.Command;
import java.awt.Point;

public class DrawCommand implements Command {
    // �׸� �׸��� ���
    protected Drawable drawable;
    // �׸� �׸��� ��ġ
    private Point position;
    // ������
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }
    // ���� 
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
