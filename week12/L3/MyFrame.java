package L3;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class MyFrame {

    private JFrame f;
    private MyClock clock;
    private Thread t;

    MyFrame() {
        f = new JFrame();
        clock = new MyClock();
        t = new Thread(clock);
        t.start();
        f.add(clock);
        f.pack();
        f.setSize(450,200);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
    new MyFrame();
    }
}
