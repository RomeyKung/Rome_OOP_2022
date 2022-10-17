import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CalculatorSample implements ActionListener{
    protected JFrame f;
    protected JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bnp, bnm, bnt, bnd, bne, bnc, bn0;
    protected JPanel p1, p2;
    protected JTextField txt;
    private int temp = 0;
    private String check = "";
    private boolean check2 = false;
    public CalculatorSample(){
        f = new JFrame("My Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bn7 = new JButton("7");
        bn8 = new JButton("8");
        bn9 = new JButton("9");
        bnp = new JButton("+");
        bn4 = new JButton("4");
        bn5 = new JButton("5");
        bn6 = new JButton("6");
        bnm = new JButton("-");
        bn1 = new JButton("1");
        bn2 = new JButton("2");
        bn3 = new JButton("3");
        bnt = new JButton("X");
        bn0 = new JButton("0");
        bnc = new JButton("c");
        bne = new JButton("=");
        bnd = new JButton("/");
        txt = new JTextField();
        p1 = new JPanel();
        p2 = new JPanel();
        p2.setLayout(new GridLayout(1,1));
        txt.setEnabled(false);
        p2.add(txt);
        p1.setLayout(new GridLayout(4,4));
        p1.add(bn7); p1.add(bn8); p1.add(bn9);
        p1.add(bnp); p1.add(bn4); p1.add(bn5);
        p1.add(bn6); p1.add(bnm); p1.add(bn1);
        p1.add(bn2); p1.add(bn3); p1.add(bnt);
        p1.add(bn0); p1.add(bnc); p1.add(bne);
        p1.add(bnd);

        bn1.addActionListener(this); bn2.addActionListener(this); bn3.addActionListener(this);
        bn4.addActionListener(this); bn5.addActionListener(this); bn6.addActionListener(this);
        bn7.addActionListener(this); bn8.addActionListener(this); bn9.addActionListener(this);
        bn0.addActionListener(this); bnp.addActionListener(this); bnm.addActionListener(this);
        bnt.addActionListener(this); bnd.addActionListener(this); bnc.addActionListener(this);
        bne.addActionListener(this);

        f.setLayout(new BorderLayout());
        f.add(p2, BorderLayout.NORTH);
        f.add(p1, BorderLayout.CENTER);
        f.setSize(400,300);
        f.setVisible(true);
        f.setLocation(580,270);

    }
    public void actionPerformed(ActionEvent ev){
        if((ev.getSource().equals(bnp)||ev.getSource().equals(bnm)||ev.getSource().equals(bnt)||ev.getSource().equals(bnd))&&check.equals("")){
            check = ev.getActionCommand();
            check2 = true;
            temp = Integer.parseInt(txt.getText());
        }else if((ev.getSource().equals(bnp)||ev.getSource().equals(bnm)||ev.getSource().equals(bnt)||ev.getSource().equals(bnd))&&!check.equals("")){
            check = ev.getActionCommand();
        }else if(ev.getSource().equals(bne)){
            if(check.equals("+")){
                temp += Integer.parseInt(this.txt.getText());
            }else if(check.equals("-")){
                temp -= Integer.parseInt(this.txt.getText());
            }else if(check.equals("X")){
                temp *= Integer.parseInt(this.txt.getText());
            }else if(check.equals("/")){
                temp /= Integer.parseInt(this.txt.getText());
            }
            txt.setText(temp+"");
            check = "";
        }else if(ev.getSource().equals(bnc)){
            txt.setText("");
            temp = 0;
        }
        else if(!check.equals("")){
            if(check2){
                txt.setText("");
                check2 = false;
            }
            txt.setText(txt.getText()+ev.getActionCommand());
        }else{
            txt.setText(txt.getText()+ev.getActionCommand());
        }

        System.out.println(temp);
    }
    public static void main(String[] args){
        new CalculatorSample();
    }
}
