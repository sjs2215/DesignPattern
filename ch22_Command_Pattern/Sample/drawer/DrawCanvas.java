package ch22.Sample.drawer;

import ch22.Sample.command.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Drawable �������̽��� �����ϰ�, java.awt.Canvas �� �����
public class DrawCanvas extends Canvas implements Drawable {
	// �׸� �׸��� ��
	private Color color = Color.red;

	// �׸� �׸��⸦ �� ���� ����
	private int radius = 6;

	// ���ݱ��� ������ �׸� �׸��� ��ɾ���� ������ ������ ����
	private MacroCommand history;

	// ��, ����, �׸� �׸��� �̷�(history)�� �޾Ƽ�,
	// DrawCanvas �ν��Ͻ��� �ʱ�ȭ�Ѵ�.
	public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width, height);
		setBackground(Color.white);
		this.history = history;
	}

	// DrawCanvas�� �ٽ� �׸� �ʿ䰡 ������ ��
	// java.awt �����ӿ�ũ�κ��� �ڵ����� ȣ��Ǵ� �޼ҵ�
	// repaint( ) �޼ҵ尡 ȣ��Ǹ�, ȭ���� ������ �� �ڵ����� paint( ) �޼ҵ尡 ����ȴ�.
	public void paint(Graphics g) {
		// history�� �����ϰ� �ִ� ��� �׸��� ��ɵ��� �����Ѵ�.
		history.execute();
	}

	// �׸���
	public void draw(int x, int y) {
		// Graphics ��ü�� ��,
		Graphics g = getGraphics();
		// ������ ���������� �����ϰ�
		g.setColor(color);
		// Graphics ��ü�� filloval(x, y, �簢�� ����, �簢�� ����)�� 
		// �̿��Ͽ� ���� �׸���.
		g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
	}
}
