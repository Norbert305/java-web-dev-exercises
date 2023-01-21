package exercises;

public class FindWordIndex {

    public static void main(String args[]) {
        String str1 = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        // In If-else statements you can use the contains() method

        if (str1.contains("Alice")) {
            System.out.println("The name Alice is found on index "+str1.indexOf("Alice"));
        } else {
            System.out.println("The Keyword :example: is not found in the string");
        }
    }



}
