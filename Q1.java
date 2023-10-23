import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {
        String fileName = "doc.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");  

                for (String word : words) {
                    if (word.length() % 2 == 0) {
                        System.out.print(word+" ");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
