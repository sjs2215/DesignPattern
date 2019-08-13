package ch04.Sample;

import ch04.Sample.framework.*;
import ch04.Sample.idcard.*;

public class Main {
    public static void main(String[] args) {

      // IDCard( ) �����ڰ� public�� �ƴ϶�, �Ʒ� ������ ������ �߻��Ѵ�.	
      //IDCard card1 = new IDCard("ȫ�浿");

		// ������ �����.
        Factory factory = new IDCardFactory();
        
		// ������ �̿��ؼ� ��ǰ(IDCard�� �����Ѵ�) 
		Product card1 = factory.create("ȫ�浿");
        Product card2 = factory.create("�̼���");
        Product card3 = factory.create("������");

		// ����� ��ǰ�� ����Ѵ�.
        card1.use();
        card2.use();
        card3.use();
    }
}
