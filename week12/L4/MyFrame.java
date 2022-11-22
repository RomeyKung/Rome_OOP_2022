package L4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFrame implements MouseListener {

    private JFrame f;
    private MyClock clock;
    private Thread t;
    
    MyFrame() {
        f = new JFrame();
        clock = new MyClock();
        t = new Thread(clock);
        t.start();
        f.add(clock);

        clock.addMouseListener(this);
        f.pack();
        f.setSize(450, 200);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    

    @Override
    public synchronized void mouseClicked(MouseEvent e) {
        if(clock.getPaused()){
            clock.resumeThread();
        }else{
            clock.pauseThread();
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        new MyFrame();
    }

}
