package cs61b.Inheritance.Comparables;

public class Maximizer {
    public static OurComparable max(OurComparable[] items) {
        int maxDex = 0;
        for (int i = 0; i < items.length; i++) {
            int cmp = items[i].compareTo(items[maxDex]);
            if (cmp > 0) {
                maxDex = i;
            }
        }
        return items[maxDex];
    }

    public static void main(String[] args) {
        DogCompare dogCompare1 =  new DogCompare("Harry",25);
        DogCompare dogCompare2 = new DogCompare("Mary",30);
        System.out.println(dogCompare2.compareTo(dogCompare1));
        DogCompare[] dogs = {new DogCompare("Harry",25),new DogCompare("Marry",30)};

        DogCompare maxDog = (DogCompare) max(dogs);
        maxDog.bark();
        System.out.println(maxDog);


    }
}
