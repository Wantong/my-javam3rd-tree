package com.company;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UseInnerClass {
    JFrame f;
    public UseInnerClass(){
        f=new JFrame();
        f.setSize(500,850);
        f.show();
        f.addMouseListener(new MouseAdapter() {
            public void MouseClicked(MouseEvent e){
                f.setTitle("click address is ("+e.getX()+","+e.getY()+")");
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new UseInnerClass();
    }
}
