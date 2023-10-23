import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q3 {
    public static void JTOI() {
        String inputFileName = "doc.txt";
        String outputFileName = "corrrect_words.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {

                String correctedLine = line.replace('J', 'I');
                writer.write(correctedLine);
                writer.newLine();
                
            }

            System.out.println("Content corrected and saved to " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JTOI();
    }
}
