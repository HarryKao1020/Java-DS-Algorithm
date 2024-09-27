package cs61b.Inheritance.Comparables;

//import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class DogComparator implements Comparable<DogComparator> {
    private String name;
    private int size;
    public DogComparator(String n , int s){
        this.name = n;
        this.size = s;
    }

    public void bark(){
        System.out.println(name+" say:bark!");
    }
    @Override
    public int compareTo(DogComparator uddaDog) {
        return this.size - uddaDog.size;
    }

    public static class NameComparator implements Comparator<DogComparator>{
        public int compare(DogComparator dog1,DogComparator dog2){
            return dog1.name.compareTo(dog2.name);
        }
    }
}
