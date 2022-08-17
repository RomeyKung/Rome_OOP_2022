/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author LAB203_40
 */
public class Built {
    public static void main(String[] args) {
        int height;
        Scanner tube = new Scanner(System.in);
        System.out.print("Enter levels: ");
        height = tube.nextInt();
        for(int i = 0;i != height;i++){
            System.out.println("#-#-#-#-#");
        }
    }
        
}
