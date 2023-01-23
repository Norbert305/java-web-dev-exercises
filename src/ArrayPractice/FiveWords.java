package ArrayPractice;
import java.util.ArrayList;
public class FiveWords {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<String>();
        players.add("Curry");
        players.add("Lebron");
        players.add("Durant");
        players.add("Kobe");
        players.add("Jordan");
        for (String i : players) {
            System.out.println(i);
        }
    }
}
