package lab11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;
public class ChatDemo implements ActionListener, WindowListener {
    private JFrame f;
    private JPanel p, p1, p2, p3;
    private JTextArea tr;
    private JTextField tf;
    private JButton btnS, btnR;
    String TextChat;
    public ChatDemo(){
        f = new JFrame("ChatDemo");
        tr = new JTextArea();
        tf = new JTextField();
        btnS = new JButton("Submit");
        btnR = new JButton("Reset");
        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        tr.setRows(20);
        tr.setColumns(45);
        tf.setColumns(45);


        p.setLayout(new BorderLayout());

        p1.setLayout(new BorderLayout());
        p1.add(tr);
        // tr.setEditable(false);
        tr.setEnabled(false);

        p2.setLayout(new BorderLayout());
        p2.add(tf, BorderLayout.SOUTH);
        p2.setSize(100,5);


        p3.add(btnS);
        p3.add(btnR);

        p.add(p1, BorderLayout.NORTH);
        p.add(p2);
        p.add(p3, BorderLayout.SOUTH);

        btnS.addActionListener(this);
        btnR.addActionListener(this);
        f.addWindowListener(this);

        f.add(p);
        f.pack();
        // f.setSize(700, 600);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - f.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - f.getHeight()) / 2);
        f.setLocation(x, y);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ev){
        if(ev.getSource().equals(btnS)){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            tr.setText(tr.getText()+dtf.format(LocalDateTime.now())+" : "+tf.getText()+"\n");
            tf.setText("");
            // try(FileWriter fw = new FileWriter("ChatDemo.dat")){
            //     TextChat = tr.getText();
            //     fw.write(TextChat);
            // }
            // catch(IOException e){
            //     System.out.println(e);
            // }
        }
        else if(ev.getSource().equals(btnR)){
            tr.setText("");
            tf.setText("");
            // try(FileWriter fw = new FileWriter("ChatDemo.dat")){
            //     fw.write("");
            // }
            // catch(IOException e){
            //     System.out.println(e);
            // }
        }
    }
    public void windowClosing(WindowEvent e) {
        try (FileWriter fw = new FileWriter("ChatDemo.dat")) {
            TextChat = tr.getText();
            fw.write(TextChat);
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowOpened(WindowEvent ev){
        try (FileReader fr = new FileReader("ChatDemo.dat")) {
            int tube;
            while ((tube = fr.read()) != -1) {
                TextChat += (char) tube;
            }
            tr.setText(TextChat);
        }
        catch (IOException er) {
            er.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new ChatDemo();
    }
}
