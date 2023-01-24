package ArrayPractice;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    //Having fun with array list
    //source: https://www.w3schools.com/java/java_arraylist.asp
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        //method add appends the values to make an array list
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Honda");
        System.out.println(cars);
        //method get retrieves the element based off the position of the index
        System.out.println(cars.get(0));
        //Method remove, removes the value of the array list based off the position of the index
        cars.remove(4);
        System.out.println(cars);
        //This method prints out the length of the array list
        System.out.println(cars.size());

        //How to use the for loop for the array list
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("---------------");
        //How to use the for-each loop for the array list
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println("---------------");

        //This is how we store numbers in an array list

        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(10);
        myNumbers.add(100);
        myNumbers.add(15);
        myNumbers.add(50);
        myNumbers.add(2);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
        //This allows you to sort the numbers in order but don't forget to import Collections
        Collections.sort(myNumbers);
        System.out.println(myNumbers);
    }

}
