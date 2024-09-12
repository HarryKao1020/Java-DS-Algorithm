package cs61b.Inheritance.Comparables;

class Dog{
    private int size;
    private String name;
    public Dog(String name,int size){
        this.name = name;
        this.size = size;
    }

    public int size(){
        return size;
    }

    public String getName(){
        return name;
    }
    public static void bark(){
        System.out.println("Bark! Bark!");
    }
}

public class MaximizerA {
   /*
   public static Object max(Object[] items){
        int maxDex = 0;
        for(int i =0 ; i < items.length ; i++){
            if(items[i] > items[maxDex]){  //Not every object can support greater comparator.
                maxDex = i;
            }
        }
        return items[maxDex];
    }
    */

    public static Dog maxDog(Dog[] dogs){
        if(dogs == null || dogs.length ==0){
            return null;
        }

        Dog maxDog = dogs[0];
        for(Dog d : dogs){
            if(d.size() > maxDog.size()){
                maxDog  = d;
            }
        }
        return maxDog;
    }



    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Elyse",3),new Dog("Sture",9),new Dog("Evan",2),new Dog("Seven",14)};
        Dog maxDog = (Dog) maxDog(dogs);  //Dog is an object, but an object is not always a dog, so Java complier will not let a dog declared variable contain an object.
        System.out.println(maxDog.size());
        System.out.println(maxDog.getName());
        maxDog.bark();
    }
}
