import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteAFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("hello foo");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ReadAFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("Foo.txt");
            FileReader fileReader = new FileReader(myFile);

            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// replaced 8 lines above
class ReadAFileUsingOptimisedStreams {
    public static void main(String[] args) throws IOException {
        Files.lines(Path.of("Foo.txt"))
                .forEach(System.out::println);
    }
}
