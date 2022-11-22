
package L1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class PoringConstructor implements ActionListener{
    private JFrame f;
    private JButton btn;
    PoringConstructor(){
        f = new JFrame();
        btn = new JButton("Add");
        f.setLayout(new FlowLayout());
        btn.addActionListener(this);
        f.add(btn);
        f.pack();
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new PoringConstructor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         Poring poring = new Poring();
         Thread thread = new Thread(poring);
         thread.start();
        }
    
}

