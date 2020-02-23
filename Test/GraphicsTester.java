import javax.swing.*;
import java.awt.*;

public class GraphicsTester extends JFrame {
    public GraphicsTester()
    {
        super("演示字体、颜色、绘图");
        setVisible(true);//display this window
        setSize(480,250);
    }
   public void paint(Graphics g)   {
        super.paint(g);
        g.setFont(new Font("SanSerif",Font.BOLD,12));
        g.setColor(Color.blue);//set the color
        g.drawString("Font ScanSSerif BOLD，12，Blue",20,50);
        g.setFont(new Font("Serif",Font.ITALIC,14));
        g.setColor(new Color(255,0,0));
        g.drawString("Font Srif, ITALIC, 14, RED",250,50);
        g.drawLine(20,60,460,60);
   }
   public static void main(String args[]){
        GraphicsTester application = new GraphicsTester();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }
}
