package L4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class MyClock extends JLabel implements Runnable {
    private boolean paused;
    public boolean getPaused(){
        return paused;
    }
    public synchronized void checkPaused() {
        while (paused) {
            try {
                this.wait();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }

        }
    }
    public void pauseThread(){
        paused = true;
    }
    public synchronized void resumeThread(){
        paused = false;
        this.notify();
    }
    @Override
    public void run() {
        int sec = 0;
        int min = 0;
        int hour = 0;
        try {
      
            while (true) {
                checkPaused();
                if (sec == 60) {
                    min += 1;
                    sec = 0;
                }
                if (min == 60) {
                    hour += 1;
                    min = 0;
                }
                this.setFont(new Font("tohoma", Font.BOLD, 80));
                this.setText(String.format("%02d : %02d : %02d", hour, min, sec));
                sec++;
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}