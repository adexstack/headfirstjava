import java.util.List;
import java.util.Map;
import java.util.Set;


public class FactoryMethods {
    public static void main(String[] args) {
        List<String> strings = List.of("somersault", "cassidy", "10");
        System.out.println(strings);

        List<SongV5> songs = List.of(new SongV5("somersault", "zero 7", 147),
                new SongV5("somers", "zero 7", 147),
                new SongV5("ault", "zero 7", 147));
        System.out.println(songs);

        Set<Book> books = Set.of(new Book("How Cats Work"),
                new Book("Remix your body"),
                new Book("Finding Emo"));
        System.out.println(books);

        Map<String, Integer> scores = Map.of("Kathy", 42,
                        "Bert", 343,
                        "Skyler", 420);
        System.out.println(scores);



    }
}
