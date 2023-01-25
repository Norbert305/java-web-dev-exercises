package org.launchcode.java.demos.lsn6inheritance;

import javax.naming.Name;

public class Main {

    public Main() {

    }

    //These are my instance fields
    String myName;
    int myAge;

    //Here is my constructor that resembles the parent class
    public Main(String name, int age) {
        myName = name;
        myAge = age;
    }

    //Here are some methods
   public int add(int num1, int num2) {
        return  num1 + num2;
   }

    public int multiply(int num1, int num2) {
        return  num1 * num2;
    }


    public static void main(String[] args) {
        //new instance created as an object reflecting the constructor
        Main HouseCat = new Main("Garfield",12);
        Main addThis = new Main();
        System.out.println(HouseCat.myAge);
        System.out.println(HouseCat.myName);
        System.out.println(addThis.add(5,5));
        System.out.println(addThis.multiply(5,5));


    }
}
