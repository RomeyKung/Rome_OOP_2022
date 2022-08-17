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
public class MyCall {
    public static void main(String[] args) {
        double salary;
        Scanner tube = new Scanner(System.in);
        System.out.print("Enter your salary");
        salary = tube.nextDouble();
        if(salary>50000){
            salary *= 0.1;
        }else{
            salary *= 0.05;
        }
        System.out.println(salary);
    }
}
