package cs61b.Inheritance.ExtendExecrise;

public class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
        System.out.println("Animal constructor called");
    }

    public void eat(){
        System.out.println("The animal is eating");
    }
}
