package ch04.A2.idcard;

import ch04.A2.framework.*;

public class IDCard extends Product {
    private String owner;
    private int serial;
    IDCard(String owner, int serial) {
        System.out.println(owner + "(" + serial + ")" + "�� ī�带 ����ϴ�.");
        this.owner = owner;
        this.serial = serial;
    }
    public void use() {
        System.out.println(owner + "(" + serial + ")" + "�� ī�带 ����մϴ�.");
    }
    public String getOwner() {
        return owner;
    }
    public int getSerial() {
        return serial;
    }
}
