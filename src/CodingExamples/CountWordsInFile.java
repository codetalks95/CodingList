package CodingExamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CountWordsInFile {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\nbhushan\\Downloads\\PFDS_HO.text";
        System.out.println("The Count in the file is::" + "" + countWordsInFile(filePath));
    }

    private static int countWordsInFile(String filePath) throws IOException {
        int count = 0;
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File doesn't exist");
            return count;
        } else {
            FileReader readFile = new FileReader(filePath);
            BufferedReader br = new BufferedReader(readFile);
            String line = br.readLine();
            while (line != null) {
                String[] parts = line.split(" ");
                count += Arrays.stream(parts).count();
                line = br.readLine();
            }
        }
        return count;
    }
}