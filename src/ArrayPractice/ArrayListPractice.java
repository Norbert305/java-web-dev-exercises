package ArrayPractice;
import java.util.ArrayList;
public class ArrayListPractice {


    public static void main(String[] args) {
        //I came up with this one to understand the fundamentals

        //Instructions: Write a static method to find the sum of all the even numbers in an ArrayList. Within main, create a list with at least 10 integers and call your method on the list.
        ArrayList<Integer> sumEven= new ArrayList<>();

        sumEven.add(1);
        sumEven.add(2);
        sumEven.add(3);
        sumEven.add(4);
        sumEven.add(5);
        sumEven.add(6);
        sumEven.add(7);
        sumEven.add(8);
        sumEven.add(9);
        sumEven.add(10);
        for (int i = 0; i < sumEven.size(); i++) {
            if (i % 2 != 0) {
                System.out.println(sumEven.get(i));
            }

        }
    }

}
