package ch17.Sample;

import java.util.Vector;
import java.util.Iterator;

// ���� �����ϴ� Ŭ����
public abstract class NumberGenerator {
	// NumberGenerator�� �����ϰ� �ִ� Observer���� �����ϰ� �ִ� �ʵ�
	private Vector observers = new Vector(); 

	// Observer�� �߰��� �� ȣ���ϴ� �޼ҵ�
	public void addObserver(Observer observer) { // Observer�� �߰�
		observers.add(observer);
	}

	// Observer�� ������ �� ȣ���ϴ� �޼ҵ�
	public void deleteObserver(Observer observer) { // Observer�� ����
		observers.remove(observer);
	}

	// Observer ��������, ������ ������ ���ŵǾ��� ������ 
	// ����� ǥ�õ� �������ּ��䡱��� �˷��ִ� �޼ҵ�
	public void notifyObservers() { 
		Iterator it = observers.iterator();
		// Observer���� update(this) �޼ҵ带 �������� ȣ���Ѵ�.
		while (it.hasNext()) {
			Observer o = (Observer) it.next();
			o.update(this);
		}
	}

	public abstract int getNumber(); // ���� ����Ѵ�.

	public abstract void execute(); // ���� �����Ѵ�.
}
