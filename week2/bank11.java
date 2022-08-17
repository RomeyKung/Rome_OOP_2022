/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author LAB203_40
 */
import java.util.Scanner;
public class bank11 {
    public static void main(String[] args) {
        int salary;
        char bank;
        Scanner tube = new Scanner(System.in);
        System.out.print("Input your money :");
        salary = tube.nextInt();
        System.out.print("Input your account type(Please type A B C or Xin uppercase) :");
        bank = tube.next().charAt(0);
        if(bank == 'A'){
            salary *= 1.015f;
        }else if(bank == 'B'){
            salary *= 1.02;
        }else if(bank == 'C'){
            salary *= 1.015f; 
        }else if(bank == 'X'){
            salary *= 1.05; 
        }
        System.out.println("Your total money in one year = "+salary);
    }
}
