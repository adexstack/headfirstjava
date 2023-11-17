import java.util.List;
import java.util.Optional;

public class TerminalOprn {
    public static void main(String[] args) {
        List<Song> songs = new Songs().getSongs();
        boolean anyMatchResult = songs.stream()
                .anyMatch(s -> s.getGenre().equals("R&B"));
                // allMatch
                // noneMatch
        System.out.println("anyMatchResult: " + anyMatchResult);

        Optional<Song> findFirstResult = songs.stream()
                .filter(s -> s.getYear() == 1995) // will be empty for 3995
                .findFirst();
        // findAny
        // max(Comparator c)
        // min(Comparator c)
        //reduce(BinaryOperator

        if (findFirstResult.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("findFirstResult: " + findFirstResult);
        }

        long count = songs.stream()
                .map(Song::getArtist)
                .distinct()
                .count();
        System.out.println("count: " + count);

        Optional<String> afternoonCoffee = songs.stream()
                .sorted((a, b) -> a.getGenre().compareTo(b.getGenre())) // sorted should come before map for integrity
                .map(Song::getGenre)
                .findFirst();
        System.out.println("afternoonCoffee: " + afternoonCoffee);

    }
}
