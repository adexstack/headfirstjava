import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Jukebox2 {
    public static void main(String[] args) {
        new Jukebox2().go();
    }

    private void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);
        System.out.println("-".repeat(30));
        Collections.sort(songList);
        System.out.println(songList);
    }

}
