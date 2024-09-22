package cs61b.Inheritance.Comparables;

public class DogLauncher {
    public static void main(String[] args) {
        DogComparator d1 = new DogComparator("Elyse",3);
        DogComparator d2 = new DogComparator("Sture",9);
        DogComparator d3 = new DogComparator("Benjamin",15);

        DogComparator.NameComparator nc = new DogComparator.NameComparator();
        if(nc.compare(d1,d3) >0){
            d1.bark();
        }
    }
}
