package in.kgcoding.file;

import java.io.FileWriter;
import java.io.IOException;

public class CodingWriter {
    public static void main(String[] args) throws IOException {
        String fileName = "java-course.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is the best java course\n");
            for (int i = 0; i < 10000 ; i++) {
                writer.write("*");
            }
            writer.flush();
            System.out.println("Successfully written");
        } catch (IOException ioException){
            System.out.printf("Exception occured %s", ioException.getMessage());
        }
    }
}
