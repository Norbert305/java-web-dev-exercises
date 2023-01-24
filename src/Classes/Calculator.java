package Classes;

public class Calculator {


    //public method returns an int
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    //public method returns an int
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    //public method returns an int
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    //public method returns an int
    public int devide(int num1, int num2) {
        return num1 / num2;
    }
    //public method returns an int
    public int module(int num1, int num2) {
        return num1 % num2;
    }
    //main method
    public static void main(String[] args) {

        //create a calculator object called myCalculator
        Calculator myCalculator = new Calculator();

        //print out the value of calling each of the public methods
        System.out.println(myCalculator.add(10,10));//20
        System.out.println(myCalculator.subtract(45,11));//34
        System.out.println(myCalculator.multiply(10,10));//100
        System.out.println(myCalculator.devide(100,10));//10
        System.out.println(myCalculator.module(100,10));//0
    }



}
