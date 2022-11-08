package lab11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class StudentView implements ActionListener, WindowListener{
    private JFrame f;
    private JPanel p, p1, p2;
    private JLabel ilb, nlb, mlb;
    private JTextField itf, ntf, mtf;
    private JButton btnD, btnW;
    public StudentView(){
        f = new JFrame("");
        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        ilb = new JLabel("ID :");
        nlb = new JLabel("Name :");
        mlb = new JLabel("Money :");
        itf = new JTextField();
        ntf = new JTextField();
        mtf = new JTextField("0");
        btnD = new JButton("Deposit");
        btnW = new JButton("Withdraw");

      

        mtf.setEditable(false);

        p1.setLayout(new GridLayout(3,2));
        p1.add(ilb);         p1.add(itf);
        p1.add(nlb);         p1.add(ntf);
        p1.add(mlb);         p1.add(mtf);
        
        p2.setLayout(new FlowLayout());
        p2.add(btnD);        p2.add(btnW);

        p.setLayout(new BorderLayout());
        p.add(p1, BorderLayout.NORTH);
        p.add(p2, BorderLayout.SOUTH);

        btnD.addActionListener(this);
        btnW.addActionListener(this);
        f.addWindowListener(this);

        f.add(p);
        f.pack();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - f.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - f.getHeight()) / 2);
        f.setLocation(x, y);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ev){
        if(ev.getSource().equals(btnD)){
            mtf.setText((Integer.parseInt(mtf.getText()))+100+"");
        }
        else if(ev.getSource().equals(btnW)){
            if((Integer.parseInt(mtf.getText())-100)<0){
                mtf.setText("0");
            }
            else{
                mtf.setText((Integer.parseInt(mtf.getText()))-100+"");
            }
        }
    }

    public void windowOpened(WindowEvent ev){
        
        Student s = null;
        try(FileInputStream fis = new FileInputStream("StudentM.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);){
            s = (Student) ois.readObject();
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException c){
            System.out.println(c);
        }
        if(s != null){
            itf.setText(s.getID()+"");
            ntf.setText(s.getName()+"");
            mtf.setText(s.getMoney()+"");
        }
        else{
            itf.setText("");
            ntf.setText("");
            mtf.setText(0+"");
        }
    }
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowClosed(WindowEvent ev){}
    public void windowClosing(WindowEvent ev){
        try(FileOutputStream fos = new FileOutputStream("StudentM.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);){
            oos.writeObject(new Student(ntf.getText(), Integer.parseInt(itf.getText()), Integer.parseInt(mtf.getText())));
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new StudentView();
    }
}
