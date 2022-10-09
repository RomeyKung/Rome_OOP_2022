import java.awt.*;
import javax.swing.*;
public class TellerGUI{
    private JFrame f;
    private JPanel p1, p2, p3;
    private JLabel lbl1, lbl2;
    private JTextField txt1, txt2;
    private JButton bn1, bn2, bn3;
    public TellerGUI(){
        f = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        lbl1 = new JLabel("Balance");
        txt1 = new JTextField("6000");
        p1.setLayout(new GridLayout(1,2));
        txt1.setEditable(false);
        p1.add(lbl1);
        p1.add(txt1);
        lbl2 = new JLabel("Amount");
        txt2 = new JTextField();
        p2.setLayout(new GridLayout(1,2));
        p2.add(lbl2);
        p2.add(txt2);
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        p3.setLayout(new GridLayout(1,3));
        p3.add(bn1);
        p3.add(bn2);
        p3.add(bn3);
        f.setLayout(new GridLayout(4,1));
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
}