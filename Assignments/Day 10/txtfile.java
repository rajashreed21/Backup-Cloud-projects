package day9.assignments;
import java.io.*;
import java.util.*;

public class txtfile {
    public static void main(String[] args) {
        

        String inputFile = "input.txt";

        String outputFile = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));

             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            

            Map<String, Integer> wordFreq = new HashMap<>();

            String line;

            // Read lines from the file

            while ((line = reader.readLine()) != null) {

                // Split the line into words

                String[] words = line.split("\\s+");

                for (String word : words) {

                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();


                    wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);

                }

            }

            for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {

                writer.write(entry.getKey() + ": " + entry.getValue());

                writer.newLine();

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}




