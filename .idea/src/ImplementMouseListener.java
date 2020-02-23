package com.company;
import javax.swing.*;
import java.awt.event.*; // load MouseListener Class package
import javax.swing.*; //load all JFrame package
public class ImplementMouseListener implements MouseListener{
    JFrame f;
    public ImplementMouseListener(){
        f = new JFrame(); //new windows;
        f.setSize(300,150);
        f.show();
        f.addMouseListener(this);// add mouse monitor event
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseClicked(MouseEvent e){
        f.setTitle("click the address("+e.getX()+","+e.getY()+")");
    }

    public static void main(String[] args) {
        new ImplementMouseListener();
    }
}
