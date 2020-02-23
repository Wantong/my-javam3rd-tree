
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExtendMouseAdapter extends MouseAdapter {
    JFrame f;
    public ExtendMouseAdapter(){
        f = new JFrame();
        f.setSize(300,150);
        f.show();
        f.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mouseClicked(MouseEvent e){
        f.setTitle("click address is ("+e.getX()+","+e.getY()+")");
    }

    public static void main(String[] args) {
        new ExtendMouseAdapter();
    }
}
