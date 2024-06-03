package maps;
import java.util.*;

public class frequency {
    public static void main(String[] args) {
        String text = "learning new things is always an excited then learning is always an essential part";

        String[] words = text.split(" ");

        Map<String, Integer> ls = new HashMap<>();

        for (String word : words) {
            ls.put(word, ls.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : ls.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

        