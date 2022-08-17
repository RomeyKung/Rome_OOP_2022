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
public class salary10 {
    public static void main(String[] args) {
        String name;
        int age,day1,day2,weight,salary = 0;
        Scanner nm = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.print("name: ");
        name = nm.nextLine();
        System.out.print("age: ");
        age = in.nextInt();
        System.out.print("working days: ");
        day1 = in.nextInt();
        System.out.print("absent days: ");
        day2 = in.nextInt();
        System.out.print("body weight: ");
        weight = in.nextInt();
        if (age>=21 && age<=30){
            salary = (day1*300)-(day2*50);
        }else if(age>=31 && age<=40){
            salary = (day1*500)-(day2*50);
        }else if(age>=41 && age<=50){
            salary = (day1*1000)-(day2*25);
        }else if(age>=51 && age<=60){
            salary = (day1*3000);
        }
        System.out.println("Hi, "+name);
        System.out.println("Your salary is "+salary+" Bath");
        if(weight>=51 && weight<=60){
            salary += 5000;            
        }else if(weight>=61 && weight<=90){
            salary += 5000;
        }
        System.out.println("Your salary and bonus is "+salary+" Bath");
    }
}
