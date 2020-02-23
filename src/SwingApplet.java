import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApplet extends JApplet {
    public void init(){
        Container contentPane=getContentPane();
        contentPane.setLayout(new GridLayout(2,1));
        JButton button= new JButton("Click me");
        final JLabel label= new JLabel();
        contentPane.add(button);
        contentPane.add(label);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

            }

            public void actionPerformed(ActiveEvent event){
                String information=JOptionPane.showInputDialog("请输入一串字符");
                        label.setText(information);
            }
        });
    }
}
