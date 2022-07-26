package OOP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args){
//        initializing the object
        ArrayList<String> cars = new ArrayList<String>();

//        appending to the arrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Benz");

        System.out.println(cars);
        System.out.println(cars.get(2)); // fetching a single element

//        to edit an element
        cars.set(2, "Audi");
        System.out.println(cars);

//        to remove an element
        cars.remove(2);
        System.out.println(cars);

//        to view the size or length of the array
        System.out.println(cars.size());

//        you can clear the array
        cars.clear();
        System.out.println(cars);

//        you can sort your arrays alphabetically or numerically
        Collections.sort(cars); // sort cars
        System.out.println(cars);
    }
}
