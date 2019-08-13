package ch23.A1;

import ch23.A1.language.InterpreterFacade;
import ch23.A1.turtle.TurtleCanvas;

import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;

public class Main extends Frame implements ActionListener {
	private TurtleCanvas canvas = new TurtleCanvas(400, 400);

	private InterpreterFacade facade = new InterpreterFacade(canvas);

	private TextField programTextField = new TextField(
			"program repeat 3 go right go left end end");

	public Main(String title) {
		super(title);

		setLayout(new BorderLayout());

		programTextField.addActionListener(this);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		add(programTextField, BorderLayout.NORTH);
		add(canvas, BorderLayout.CENTER);
		pack();
		setVisible(true);
		parseAndExecute();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == programTextField) {
			parseAndExecute();
		}
	}

	private void parseAndExecute() {
		String programText = programTextField.getText();
		System.out.println("programText = " + programText);
		facade.parse(programText);
		repaint(); // �ڵ����� paint()�� ȣ���Ѵ�.
	}

	public void paint(Graphics g) {
		System.out.println("Main.paint( ): start");
		canvas.initialize();
		facade.execute();
		System.out.println("Main.paint( ): end");
	}

	public static void main(String[] args) {
		new Main("Interpreter Pattern Sample");
	}
}
