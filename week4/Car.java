/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4_rome;
/**
 *
 * @author LAB203_31
 */
public class Car extends Vehicle {
    private String typeEngine;
    public void setTypeEngine(String t){
        typeEngine = t;
    }
    public String getTypeEngine(){
        return typeEngine;
    }
    public void showCarInfo(){
        System.out.println("Car engine is "+ typeEngine + ".");
        this.showInfo();
    }
    public void setCarInfo(int s, String t, String y){
        this.setFuel(s);
        this.setTopSpeed(t);
        this.setTypeEngine(y);
    }
    public void move(){
        
        if (this.getFuel() >= 50){
            System.out.println("Move.");
            setFuel(this.getFuel()-50);}
        else{
            System.out.println("Please add fuel.");
        }
    }
}
