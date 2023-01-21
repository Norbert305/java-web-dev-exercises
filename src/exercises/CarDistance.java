package exercises;

import java.util.Scanner;

public class CarDistance {
    //25 miles = 1 gallon: Please use this logic to receive an appropriate answer
    //Goal is to calculate how many miles per gallon.
    //Confirmed this works test 1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven today total?:");
        double m = input.nextDouble();
        System.out.println("How many gallons of gas did you put in your tank?:");
        double g = input.nextDouble();
        double milesPerGallon = m/g;
        System.out.println("The total miles per gallon is " + milesPerGallon);
    }

}
