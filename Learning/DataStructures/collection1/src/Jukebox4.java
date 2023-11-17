import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Jukebox4 {
    public static void main(String[] args) {
        new Jukebox4().go();
    }

    private void go() {
        List<SongV3> songList = MockSongs.getSongsV3();

        // unsorted songList
        System.out.println(songList);
        System.out.println("-".repeat(30));

        // sorted by title (using the Song's compareTo method)
        Collections.sort(songList);
        System.out.println(songList);

        // sorted by artist name (using ArtistComparator)
        songList.sort(new ArtistCompare());
        System.out.println(songList);
    }
}

class ArtistCompare implements Comparator<SongV3> {
    @Override
    public int compare(SongV3 one, SongV3 two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}
