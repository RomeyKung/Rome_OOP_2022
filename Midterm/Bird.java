package Midterm;

public abstract class Bird extends Animal implements Flyable{
    public Bird(String name, int age){
        setName(name);
        setAge(age);
        setPower(150);
        // super(name, 150, age);
    }
    public abstract void wingAttack(Animal a);

}
