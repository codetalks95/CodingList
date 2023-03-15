package FileIO;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class FileIO {
    public static void main(String[] args) throws IOException, URISyntaxException {
        String URL = "C:\\Users\\nbhushan\\Desktop\\welcomes\\test.txt";
        String targetDirectory = "C:\\Users\\nbhushan\\Pictures\\";
        if (fileIO()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(URL));
            //Read Text to File.
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
            downloadFile(URL, targetDirectory);
        }
    }

    private static boolean fileIO() throws IOException {
        File file = new File("C:\\Users\\nbhushan\\Desktop\\welcomes");
        if (file.mkdir() || file.exists()) {
            //Write Text to File.
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\nbhushan\\Desktop\\welcomes\\test.txt"));
            writer.write("welcome to java");
            writer.close();
            return true;
        }
        return false;
    }

    private static void downloadFile(String sourceURL, String targetDirectory) throws IOException {
        //Copying File or Downloading file
        URL url = new URL("file:///" + sourceURL);
        FileUtils.copyURLToFile(url, new File(targetDirectory + "test" + ".txt"));
    }
}
