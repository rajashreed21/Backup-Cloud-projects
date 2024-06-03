package sets;
import java.util.*;

public class uniquewords {
    public static void main(String[] args) {
        String text = "Today example of set of unique words in set";
    
        Set<String> ex = new HashSet<>();

        String[] words = text.split(" ");

        for (String word : words) {

            ex.add(word);

        }

        System.out.println("Number of unique words: " + ex.size());

    }

}
    
