package ArrayPractice;
import java.util.Arrays;
public class CreateArray {

    public static  void  main(String[] args) {

        int[] numbers = {1, 1, 2, 3, 5, 8};
        //Instructions: Print out the array
        System.out.println(Arrays.toString(numbers));
        //Instructions: Print out the odd numbers in the array
        for (int value : numbers) {
            if (value % 2 != 0) {
                System.out.println(value);
            }
        }

        //My first original answer
        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        char[] result = myString.toCharArray();
        System.out.println(result);
        //This one I found in the lesson but still educational
        //Instructions: Use the split method to divide the string at each space and store the individual words in an array. If you need to review the method syntax,
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));
        //Instructions: Repeat steps 3 and 4, but change the delimiter to split the string into separate sentences.
        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));




    }


}
