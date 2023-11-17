import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Using HashSet
public class Jukebox9 {
    public static void main(String[] args) {
        new Jukebox9().go();
    }

    private void go() {
        List<SongV4> songList = MockMoreSongs.getSongsV4(SongV4::toStringTitle);

        // unsorted songList
        System.out.println(songList);
        System.out.println("-".repeat(30));

        // sorted by title (using Lambda)
        songList.sort((one,two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        // Using Hashset removing duplicate as hashcode and equals are overridden
        Set<SongV4> songSet = new HashSet<>(songList);
        System.out.println(songSet);


    }
}
