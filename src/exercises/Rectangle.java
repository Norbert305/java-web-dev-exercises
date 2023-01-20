package exercises;
import java.util.Scanner;
public class Rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle please?:");
        double l = input.nextDouble();
        System.out.println("What is the width of your rectangle please?:");
        double w = input.nextDouble();
        double area = l*w;
        System.out.println("The area of your rectangle is " + area);
    }
}
