package L3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class MyClock extends JLabel implements Runnable {

    @Override
    public void run() {
        int sec = 0;
        int min = 0;
        int hour = 0;
        try {
            while (true) {
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
