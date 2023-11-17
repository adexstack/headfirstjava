package installer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Install {
    public static void main(String[] args) {
        try {
            Path myPath = Paths.get("MyApp");
            Path myPath2 = Paths.get("MyApp", "media");
            Path myPath3 = Paths.get("MyApp", "source");
            //Path mySource = Paths.get("Myapp.class");
            Path myMedia = Paths.get( "MyMedia.txt");

            Files.createDirectory(myPath);
            Files.createDirectory(myPath2);
            Files.createDirectory(myPath3);
            //Files.move(mySource, myPath3.resolve(mySource.getFileName()));
            Files.move(myMedia, myPath2.resolve(myMedia.getFileName()));
        } catch (IOException e) {
            System.out.println("Got an NIO Exception" + e.getMessage());
        }
    }
}
