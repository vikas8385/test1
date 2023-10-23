import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) {
        String fileName = "doc.txt";
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName)) ) {
            while (br.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Total lines: " + lineCount);
    }
}
