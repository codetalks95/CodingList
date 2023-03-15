package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadEveryFileFromDirectory {
    public static void main(String[] args) throws IOException {
        String sourceUrl = "C:\\Users\\codeTalksDNA\\Desktop\\welcomes\\";
        readEveryFileFromDirectory(sourceUrl);
    }

    private static void readEveryFileFromDirectory(String sourceUrl) throws IOException {
        //Read Every file from Directory.
        File folder = new File(sourceUrl);
        BufferedReader bufferedReader = null;
        File[] listOfFiles = folder.listFiles();
        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (skipFile(file, sourceUrl)) {
                    if (file.isFile()) {
                        bufferedReader = new BufferedReader(new FileReader(file));
                        System.out.println(bufferedReader.readLine());
                    }
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            }
        }
    }

    private static boolean skipFile(File file, String sourceUrl) {
        return !file.getPath().equals(sourceUrl + "test2.txt");
    }
}