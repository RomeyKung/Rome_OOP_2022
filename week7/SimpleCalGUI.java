import java.awt.*;
import javax.swing.*;
public class SimpleCalGUI {
    private JFrame f;
    private JPanel p, p1, p2;
    private JTextField txt1, txt2, txt3;
    private JButton bn1, bn2, bn3, bn4;
    public SimpleCalGUI(){
        f = new JFrame("เครื่องคิดเลข");
        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        bn1 = new JButton("Plus");
        bn2 = new JButton("Minus");
        bn3 = new JButton("Multipy");
        bn4 = new JButton("Divide");
        p.setLayout(new FlowLayout());
        p.add(p1);
        p.add(bn1);
        p.add(bn2);
        p.add(bn3);
        p.add(bn4);
        p.add(p2);
        f.setLayout(new GridLayout(4,1));
        f.add(txt1);
        f.add(txt2);
        f.add(p);
        f.add(txt3);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }


}