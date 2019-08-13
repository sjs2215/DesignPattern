package ch22.A1.drawer;

import ch22.A1.command.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawCanvas extends Canvas implements Drawable {
    // �׸��� ��      
    private Color color;    
    // �׸��� ���� �ݰ�    
    private int radius;     
    // �̷�
    private MacroCommand history;
    // ������
    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
        init();                             
    }
    // �̷���ü�� �ٽ� �׸���
    public void paint(Graphics g) {
        history.execute();
    }
    // �ʱ�ȭ                           
    public void init() {                    
        color = Color.red;                  
        radius = 6;                         
    }                                       
    // �׸���
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
    public void setColor(Color color) {     
        this.color = color;                 
    }                                       
}
