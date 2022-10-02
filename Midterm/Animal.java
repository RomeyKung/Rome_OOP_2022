package Midterm;

public abstract class Animal {
    private String name;
    private int power;
    private int age;
    public Animal(){
        name = "";
        power = 0;
        age = 0;
    }
    public Animal(String name, int power, int age){
        this.name = name;
        this.power = power;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPower(int power){
        this.power += power;
    }
    public int getPower(){
        return power;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public boolean equals(Animal a){
        return this.name.equals(a.name) && this.age == a.age;
    }
    public String toString(){
        return "Animal : name = " + name + ", power = " + power +", age = "+ age;
    }
    public abstract void eat(Food f);
}
