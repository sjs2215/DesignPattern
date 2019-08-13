package ch12.Sample;

import java.io.*;
	
public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world."); //  ��Hello, world.���� ������� �ʰ� ǥ���� ��
        Display b2 = new SideBorder(b1, '#'); // b1�� ���� ��#�� ���ڷ� �¿쿡 ����� ��
        Display b3 = new FullBorder(b2);  // b2�� ���� ��ü ����� �� ��
        b1.show();
        b2.show();
        b3.show();
 
        //  ���ȳ��ϼ��䡯�� ���� �� ����� �Ѵ�.
        Display b4 = 
                    new SideBorder(
                        new FullBorder(
                            new FullBorder(
                                new SideBorder(
                                    new FullBorder(
                                        new StringDisplay("�ȳ��ϼ���")
                                    ),
                                    '*'
                                )
                            )
                        ),
                        '/'
                    );
        b4.show();

		if(b1 instanceof StringDisplay) 
          System.out.println("b1 is instanceof StringDisplay");
		else if(b1 instanceof  SideBorder) 
		  System.out.println("b1 is instanceof SideBorder");

       if(b1 instanceof Display) 
          System.out.println("b1 is instanceof Display");
    }
}