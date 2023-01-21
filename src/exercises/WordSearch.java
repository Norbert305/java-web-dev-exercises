package exercises;

import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String decision;
        while(true){

            System.out.println("please enter the main Character: Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do");
            String name = input.nextLine();

            System.out.println("you entered the name " + name );

            System.out.println("is this name correct : Lets see!! What is the name again??");
            decision = input.nextLine();

            switch(decision){
                case "Alice":
                    System.out.println("You guessed correctly!!! the name was Alice on index "+name.indexOf(name));
                    break;
                case "alice":
                    System.out.println("You guessed correctly!! the name was alice on index"+name.indexOf(name));
                    break;
                default :
                    System.out.println("You guessed wrong!!! please enter again ");

            }

        }
    }
}