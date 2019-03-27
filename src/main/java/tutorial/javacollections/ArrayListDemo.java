package tutorial.javacollections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("BMW");
        cars.add("Handa");
        cars.add("Audi");

        int size = cars.size();
        System.out.println("The size of the list is: " + size);

        System.out.println("The item on idex 1 is: " + cars.get(1));


        for (String car: cars){
            System.out.println(car);
        }

        cars.remove(size -1);

        System.out.println("\nAfter removing the last element ");

        for (String car: cars){
            System.out.println(car);
        }
    }
}
