package text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writetext {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("src/ToWrite.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Hello ! This is Garv .");
            bufferedWriter.newLine();
            bufferedWriter.write("I am Writing in a Text file.");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
