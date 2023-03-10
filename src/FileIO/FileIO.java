package FileIO;

import java.io.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
        if (fileIO()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\nbhushan\\Desktop\\welcomes\\test.txt"));
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
        }
    }
    private static boolean fileIO() throws IOException {
        File file = new File("C:\\Users\\nbhushan\\Desktop\\welcomes");
        if (file.mkdir() || file.exists()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\nbhushan\\Desktop\\welcomes\\test.txt"));
            writer.write("welcome to java");
            writer.close();
            return true;
        }
        return false;
    }
}
