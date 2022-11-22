
package L2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class MyClock extends JLabel implements Runnable{


        

    @Override
    public void run() {
        try{
            while(true){
                Calendar d = Calendar.getInstance();
                int sec = d.get(Calendar.SECOND);
                int min = d.get(Calendar.MINUTE);
                int hour = d.get(Calendar.HOUR_OF_DAY);
               
                this.setFont(new Font("tohoma", Font.BOLD,80));
                this.setText(String.format("%02d : %02d : %02d", hour, min, sec));
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
