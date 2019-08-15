package ch17.A2;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameObserver extends Frame implements Observer, ActionListener {
	private GraphText textGraph = new GraphText(60);

	private GraphCanvas canvasGraph = new GraphCanvas();

	private Button buttonClose = new Button("Close");

	public FrameObserver() {
		super("FrameObserver");
		// BorderLayout�� GUI ������Ʈ�� ��������,�߾� �� �ϳ��� ��ġ�Ѵ�.
		setLayout(new BorderLayout());

		setBackground(Color.lightGray);
		textGraph.setEditable(false);
		canvasGraph.setSize(500, 500);

		// �� GUI ������Ʈ�� ��, �߾�, ���� �ܴ�.
		add(textGraph, BorderLayout.NORTH);
		add(canvasGraph, BorderLayout.CENTER);
		add(buttonClose, BorderLayout.SOUTH);
		// Close ��ư�� ������ ���� ActionListener�� ����Ѵ�.
		buttonClose.addActionListener(this);
		
		pack(); // ������ ũ�⸦ �����Ѵ�.
		show(); // ȭ�鿡 ���δ�.
	}

	// Close ��ư�� ������ �� ȣ��ȴ�.
	public void actionPerformed(ActionEvent e) {
		System.out.println("" + e);
		System.exit(0);
	}

	public void update(NumberGenerator generator) {
		textGraph.update(generator);
		canvasGraph.update(generator);
	}
}

class GraphText extends TextField implements Observer {
	public GraphText(int columns) {
		super(columns);
	}

	public void update(NumberGenerator generator) {
		int number = generator.getNumber();
		String text = number + ":";
		for (int i = 0; i < number; i++) {
			text += '*';
		}
		setText(text); // �ؽ�Ʈ �ʵ忡 text�� ����Ѵ�.
	}
}

// Canvas: �׸� �׸� �� �ִ� �� �簢���� ��Ÿ���� Ŭ����
class GraphCanvas extends Canvas implements Observer {
	private int number;

	public void update(NumberGenerator generator) {
		number = generator.getNumber();
		repaint();  // paint() �޼ҵ带 �ڵ����� ȣ���Ѵ�.

	}

	// Graphics: �׸� �׸��� ���� ���� ���� �޼ҵ�� 
	// �׸��� ���� ����(����, ��Ʈ ��)�� ������ �ִ� Ŭ����
	// paint() �޼ҵ�� Graphics ��ü�� ���ڷ� ���޹޴´�.
	public void paint(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		// ���� ���� ������� �����Ѵ�.
		g.setColor(Color.white);
		// 0������ 360���� ��ȣ�� �׸���.
		g.fillArc(0, 0, width, height, 0, 360);
        // ���� ���� ���������� �����Ѵ�.
		g.setColor(Color.red);
		// 90������ �ð�������� ��ȣ�� �׸���.
		g.fillArc(0, 0, width, height, 90, -number * 360 / 50);
	}
}
