import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

/**
Using Treeset. The object in the list must implement Comparable' CompareTo method to compile
 Treeset removes duplicate and also sort
 */
public class Jukebox10 {
    public static void main(String[] args) {
        new Jukebox10().go();
    }

    private void go() {
        List<SongV5> songList = MockMoreSongs2.getSongsV5();

        // unsorted songList
        System.out.println(songList);
        System.out.println("-".repeat(30));

        // sorted by title (using Lambda)
        songList.sort((one,two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        System.out.println("Treeset: Using List Object compareTo() method");
        Set<SongV5> songTreeSet = new TreeSet<>(songList);
        System.out.println(songTreeSet);

        System.out.println("Treeset: sort explicitly by Bpm (not using implemented compareTo() method");
        Set<SongV5> songTreeSetExplicit = new TreeSet<>((o1, o2) -> o1.getBpm() - o2.getBpm());
        songTreeSetExplicit.addAll(songList);
        System.out.println(songTreeSetExplicit);

    }
}

class MockMoreSongs2 {

    public static List<SongV5> getSongsV5() {
        List<SongV5> songs = new ArrayList<>();
        songs.add(new SongV5("somersault", "zero 7", 147));
        songs.add(new SongV5("cassidy", "grateful dead", 158));
        songs.add(new SongV5("$10", "hitchhiker", 140));
        songs.add(new SongV5("havana", "cabello", 105));
        songs.add(new SongV5("$10", "hitchhiker", 140));
        songs.add(new SongV5("Cassidy", "grateful dead", 158));
        songs.add(new SongV5("50 ways", "simon", 102));
        return songs;
    }


}

class SongV5 implements Comparable<SongV5> {
    private String title;
    private String artist;
    private int bpm;

    SongV5(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object aSong) {
        SongV5 other = (SongV5) aSong;
        return title.equals(other.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public int compareTo(SongV5 s) {
        return title.compareTo(s.getTitle());
    }
}
