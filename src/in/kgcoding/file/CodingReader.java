package in.kgcoding.file;

import java.io.FileReader;
import java.io.IOException;

public class CodingReader {
    public static void main(String[] args) {
        String filename = "java-course.txt";
        try(FileReader fileReader = new FileReader(filename)) {
            int read = 0;
            do {
                read = fileReader.read();
                System.out.print((char) read);
            } while (read != -1);

        } catch (IOException ioException){
            System.out.printf("Exception Occurred %s", ioException.getMessage());
        }
    }
}
