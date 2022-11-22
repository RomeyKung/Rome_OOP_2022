package L1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import  java.util.Random;


public class Poring implements MouseListener, Runnable {

    private JFrame f;
    private JLabel l0, l1;
    private ImageIcon i;
    private JButton btn;
    public static int numberOfPoring;
    public Random random = new Random();
    Poring() {
        
        int ranx  = random.nextInt(1600);
        int rany  = random.nextInt(1000);
       
        numberOfPoring++;
        String img = "img\\poring.png";
        f = new JFrame();
        i = new ImageIcon(img);
        Image new_i = i.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        i = new ImageIcon(new_i);
        l0 = new JLabel();
        l1 = new JLabel(numberOfPoring + "");
        btn = new JButton();
        l0.setIcon(i);

        f.setLayout(new BorderLayout());

        f.add(l0, BorderLayout.WEST);
        f.add(l1, BorderLayout.CENTER);
        f.addMouseListener(this);

        f.setResizable(false);
        f.setLocation(ranx, rany);
        f.pack();
        f.setVisible(true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setDefaultCloseOperation(0);
         
    }

    @Override
    public void run() {
            
            try{
                while(true){
                    Thread.sleep(10);

                    int moveX = random.nextInt(3)-1;
                    int moveY = random.nextInt(3)-1;
                    f.setLocation(f.getX()+moveX, f.getY()+moveY);
                }
            }
            catch(Exception ex){
                System.out.println(ex);
            }
           
            
    }

    public void mousePressed(MouseEvent e) {
        f.dispose();
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

}
