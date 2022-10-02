package Midterm;

public class Dog extends Animal{
    public Dog(String name, int age){
        setName(name);
        setAge(age);
        setPower(200);
    }
    public void kick(Animal a){
        setPower(10);
    }
    public void eat(Food f){
        setPower((int)(f.getPower())*1);
    }
}
