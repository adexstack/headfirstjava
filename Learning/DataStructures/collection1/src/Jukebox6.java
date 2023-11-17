import java.util.Comparator;
import java.util.List;

public class Jukebox6 {
    public static void main(String[] args) {
        new Jukebox6().go();
    }

    private void go() {
        List<SongV3> songList = MockSongs.getSongsV3();

        // unsorted songList
        System.out.println(songList);
        System.out.println("-".repeat(30));

        // sorted by title (using Lambda)
        songList.sort((one,two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        // sorted by artist name (using Lambda) (HeadFirstJava)
        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));

        // Expanding the parameter (using lambda more explicit) (self)
        //songList.sort((SongV3 one, SongV3 two) -> one.getArtist().compareTo(two.getArtist()));

        // Using Comparator.comparing (self)
        //songList.sort(Comparator.comparing(SongV3::getArtist));

        System.out.println(songList);
    }
}

