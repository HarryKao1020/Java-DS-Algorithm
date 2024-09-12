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
        DogCompare[] dogCompares = {new DogCompare("Elyse",3),new DogCompare("Sture",9),new DogCompare("Evan",2),new DogCompare("Seven",14)};
        DogCompare maxDog = (DogCompare) Maximizer.max(dogCompares);
        maxDog.bark();
    }
}
