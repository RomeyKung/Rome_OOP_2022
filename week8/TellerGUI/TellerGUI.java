import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TellerGUI implements ActionListener{
    private JFrame f;
    private JPanel p1, p2, p3;
    private JLabel lbl1, lbl2;
    private JTextField txt1, txt2;
    private JButton bnw, bnd, bne;
    private Account ac;

    public TellerGUI(Account ac){
        this.ac = ac;
        f = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        lbl1 = new JLabel("Balance");
        txt1 = new JTextField((int)ac.getBalance()+"");
        p1.setLayout(new GridLayout(1,2));
        txt1.setEditable(false);
        p1.add(lbl1);
        p1.add(txt1);
        lbl2 = new JLabel("Amount");
        txt2 = new JTextField();
        p2.setLayout(new GridLayout(1,2));
        p2.add(lbl2);
        p2.add(txt2);
        bnd = new JButton("Deposit");
        bnw = new JButton("Withdraw");
        bne = new JButton("Exit");
        p3.setLayout(new FlowLayout());
        p3.add(bnd);
        p3.add(bnw);
        p3.add(bne);
        f.setLayout(new GridLayout(4,1));
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);

        bnw.addActionListener(this);
        bnd.addActionListener(this);
        bne.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ev){
            if(ev.getSource().equals(bnw)){
                if(ac.getBalance() >= Integer.parseInt(txt2.getText())){
                    ac.withdraw(Float.parseFloat(txt2.getText()));
                    txt1.setText((int)ac.getBalance()+"");
                }
            }
            else if(ev.getSource().equals(bnd)){
                System.out.println(ac.getBalance());
                ac.deposit(Float.parseFloat(txt2.getText()));
                txt1.setText((int)ac.getBalance()+"");
            }
            else if(ev.getSource().equals(bne)){
                System.exit(1);
            }
        }
}
