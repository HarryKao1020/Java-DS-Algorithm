package cs61b.Inheritance.ExtendExecrise;

public class Dog extends Animal{

    private String breed;
    public Dog(String name,String breed){
        super(name);
        this.breed = breed;
        System.out.println("Dog Constructor called");
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Peko","Husky");
        dog1.eat();
    }
}
