package ch23.Sample;

import java.util.*;
import java.io.*;

// �̴Ͼ���� ���������͸� �۵���Ű�� ���� Ŭ����
public class Main {
	public static void main(String[] args) {
		try {
			// program.txt ������ ������ 
			BufferedReader reader = new BufferedReader(new FileReader(
					"program.txt"));
			String text;
			// �� �پ� �о ���� �ؼ��� ��Ų��.
			while ((text = reader.readLine()) != null) {
				System.out.println("text = \"" + text + "\"");
				// ProgramNode�� �����.
				Node node = new ProgramNode();
				// text�� ���ڷ��ؼ� Context ��ü�� ���� ��, �Ľ��� �õ��Ѵ�.
				node.parse(new Context(text));
				// ProgramNode�� toString( ) �� ȣ��ȴ�.
				System.out.println("node = " + node);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
