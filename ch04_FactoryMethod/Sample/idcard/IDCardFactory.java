package ch04.Sample.idcard;

import ch04.Sample.framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
	// Vector�� �迭�� ��������� ��ü ũ�Ⱑ ������ ���� �ʰ�
	// ���Ҹ� �߰��ϸ� �ʿ��� ��� ũ�Ⱑ �þ��.
    private Vector owners = new Vector();

	// �� ������ ��ǰ�� IDCard�� �����Ѵ�.
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

	// ����� ��ǰ�� owner�� ���(�߰�)�Ѵ�.
    protected void registerProduct(Product product) {
        // product �� IDCard�� ����ȯ�ؾ�, getOwner()�� ȣ���� �� �ִ�.
		owners.add(((IDCard)product).getOwner());
    }
    public Vector getOwners() {
        return owners;
    }
}
