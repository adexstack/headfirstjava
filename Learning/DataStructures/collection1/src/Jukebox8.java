import java.util.*;

public class Jukebox8 extends MockMoreSongs {

    public static void main(String[] args) {
        new Jukebox8().go();
    }


    private void go() {
        List<SongV4> songList = MockMoreSongs.getSongsV4(SongV4::toStringTitleArtist);

        // unsorted songList
        System.out.println(songList);
        System.out.println("-".repeat(30));

        // sorted by title (using Lambda)
        songList.sort((one,two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        // Using Hashset not removing duplicate as hashcode and equals are not overridden
        Set<SongV4> songSet = new HashSet<>(songList);
        System.out.println(songSet);


    }
}

