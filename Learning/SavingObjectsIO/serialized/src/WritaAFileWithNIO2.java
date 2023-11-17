import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;


public class WritaAFileWithNIO2 {
    public static void main(String[] args) {
        try {

            Path myPath = Paths.get("/myApp", "files", "MyFile.txt");
            BufferedWriter writer = Files.newBufferedWriter(myPath);
            writer.write("I am here");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
