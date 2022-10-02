package Midterm;

public class Owner {
    protected final String name;
    protected Animal animal;
    public Owner(){
        name = "";
        animal.setName("");
        animal.setAge(0);
    }
    public Owner(String name){
        this.name = name;
        this.animal = null;

    }
    public Owner(Animal animal){
        name = "";
        this.animal = animal;
    }
    public Owner(String name, Animal animal){
        this.name = name;
        this.animal = animal;

    }
    public String getName(){
        return name;
    }
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    public Animal getAnimal(){
        return animal;
    }
    public void feedFood(Food f){
        animal.eat(f);
    }
    public String toString(){
        return "Owner : name = "+name+", Animal : name = "+animal.getName()+", power = "+animal.getPower()+", age = "+animal.getAge();
    }
    public void protectOwnerFrom(Animal a){
        if(animal instanceof Dog){
           ((Dog)animal).kick(a);
        }
        else{
           ((Pigeous)animal).wingAttack(a);
        }
    }

}
